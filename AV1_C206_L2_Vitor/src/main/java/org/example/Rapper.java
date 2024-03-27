package org.example;

public class Rapper {
        String nome;
        Float nota;
        int idade;
        Microfone microfone;


        public Rapper() {
            this.microfone = new Microfone();
        }

        public void mostrarInfos() {
            System.out.println("\n" + "Nome do Rapper:" + " " + this.nome + "\n" + "Nota do rapper:" + " " + this.nota + "\n" + "Idade do rapper" + " " + this.idade + "\n");
        }

}
