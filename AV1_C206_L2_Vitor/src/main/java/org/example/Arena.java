package org.example;

public class Arena {
    public String nome;
    public String lugar;
    Rapper[] rappers = new Rapper[30];

    //adicionando rappers
    public void addRapper(Rapper rapper) {
        for (int i = 0; i < rappers.length; i++) { //varrendo o array
            if (rappers[i] == null) {
                rappers[i] = rapper;
                System.out.println("\nRapper adicionado na arena.\n");
                return;
            }
        }
        System.out.println("\nArena Lotada, Boa sorte na próxima.\n");
    }

    //conferindo qual tem microfone dourado
    public void microfoneDou() {

        for (Rapper rapper : rappers) { //for each
            if (rapper == null)
                continue;
            if (rapper.microfone.material.equalsIgnoreCase("dourado")) { //verificando strings independente do lower case
                rapper.mostrarInfos();
            }
        }
    }

    //verificando maior e menor nota
    public void Ranking(){
        float maiorNota = 0;
        float menosNota = (float) Integer.MAX_VALUE; //valor maximo
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

    //mostrando informacoes
    public void mostrarInfos() {
        System.out.println("\n" + "Nome da arena: " + " " + this.nome + "\n" + "Localização da arena: " + " " + this.lugar);
        for (Rapper rapper : rappers) {
            if(rapper != null)
                rapper.mostrarInfos();
        }
        System.out.println();
    }
}

