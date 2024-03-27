package org.example;

public class Arena {
    public String nome;
    public String lugar;
    Rapper[] rappers = new Rapper[30];

    public void addRapper(Rapper rapper) {
        for (int i = 0; i < rappers.length; i++) {
            if (rappers[i] == null) {
                rappers[i] = rapper;
                System.out.println("\nRapper adicionado na arena.\n");
                return;
            }
        }
        System.out.println("\nArena Lotada, Boa sorte na próxima.\n");
    }

    public void microfoneDou() {

        for (Rapper rapper : rappers) {
            if (rapper == null)
                continue;
            if (rapper.microfone.material.equalsIgnoreCase("dourado")) {
                rapper.mostrarInfos();
            }
        }
    }

    public void Ranking(){
        float maiorNota = 0;
        float menosNota = (float) Integer.MAX_VALUE;
        Rapper rapperMaiorNota = null;
        Rapper rapperMenorNota = null;

        for (Rapper rapper : rappers) {
            if(rapper == null)
                continue;

            if (rapper.nota > maiorNota) {
                maiorNota = rapper.nota;
                rapperMaiorNota = rapper;
            }
            if (rapper.nota < menosNota) {
                menosNota = rapper.nota;
                rapperMenorNota = rapper;
            }
        }

        System.out.println();

        System.out.println("Maior nota: ");
        if (rapperMaiorNota != null)
            rapperMaiorNota.mostrarInfos();
        else
            System.out.println("Nao possui rapper com maior nota.");

        System.out.println();

        System.out.println("Menor nota: ");
        if (rapperMenorNota != null)
            rapperMenorNota.mostrarInfos();
        else
            System.out.println("Nao possui rapper com menor nota.");

        System.out.println();
    }

    public void mostrarInfos() {
        System.out.println("\n" + "Nome da arena: " + " " + this.nome + "\n" + "Localização da arena: " + " " + this.lugar);
        for (Rapper rapper : rappers) {
            if(rapper != null)
                rapper.mostrarInfos();
        }
        System.out.println();
    }
}

