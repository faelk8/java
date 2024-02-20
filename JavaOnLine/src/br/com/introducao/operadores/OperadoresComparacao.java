package br.com.introducao.operadores;

public class OperadoresComparacao {
    public static void main(String[] args) {
        boolean vl1 = 10 > 20;
        System.out.println("10 é maior que 20 ?");
        System.out.println(vl1);

        boolean vl2 = 10 >= 20;
        System.out.println("10 é maior ou igual 20 ?");
        System.out.println(vl2);

        boolean vl3 = 10 < 20;
        System.out.println("10 é menor 20 ?");
        System.out.println(vl3);

        boolean vl4 = 10 <= 20;
        System.out.println("10 é menor ou igual 20 ?");
        System.out.println(vl4);

        System.out.println("5 é igual a 5 ?");
        System.out.println(5==5);

        System.out.println("5 é diferente de 5?");
        System.out.println(5!=5);
    }
}
