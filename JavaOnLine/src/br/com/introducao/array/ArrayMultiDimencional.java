package br.com.introducao.array;

public class ArrayMultiDimencional {
    public static void main(String[] args) {
        int[][] dias = new int [2][2];
        dias[0][0] = 1;
        dias[0][1] = 2;
        dias[1][0] = 3;
        dias[1][1] = 4;
        System.out.println("br.com.introducao.array.Array 2D - Quadrado");
        for(int i=0; i<dias.length; i++){
            System.out.println(dias[i]);
            for(int j=0; j<dias[i].length;j++){
                System.out.println(dias[i][j]);
            }
        }

        //for it
        System.out.println();
        System.out.println("br.com.introducao.array.Array 2D com for it - Quadrado");
        for(int[] ref:dias){
            for(int dia:ref){
                System.out.println(dia);
            }
        }

        System.out.println();
        System.out.println("br.com.introducao.array.Array 1D onde cada elemento é um array");
        int[] arrInt1 = {1,2,3};
        int[] arrInt2 = new int[3];
        int[] arrInt3 = new int[] {1,2,3};

        int[][] numeros = new int[3][];
        numeros[0] = new int[2];
        numeros[1] = new int[]{1,2,3};
        numeros[2] = new int[4];

        for(int[] arr:numeros){
            for(int num:arr){
                System.out.println(num);
            }
        }

    }
}
