package br.com.introducao.array;

public class Array {
    public static void main(String[] args) {
        int[] idades = new int[3];
        idades[0] = 20;
        idades[1] = 21;
        idades[2] = 22;
        System.out.println("Idade 1: "+ idades[0]);
        System.out.println("Idade 2: "+ idades[1]);
        System.out.println("Idade 3: "+ idades[2]);

        System.out.println();
        for (int i=0; i<3; i++) {
            System.out.println(idades[i]);
        }

        System.out.println();
        for (int i=0; i<idades.length;i++){
            System.out.println(idades[i]);
        }

    }
}