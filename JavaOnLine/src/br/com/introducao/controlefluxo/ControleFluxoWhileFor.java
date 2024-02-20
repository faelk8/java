package br.com.introducao.controlefluxo;

public class ControleFluxoWhileFor {
    public static void main(String[] args) {
        int contador = 10;
        while (contador < 10) {
//        while (true) {
            System.out.println(contador++);
        }

        contador = 0;
        do{
            System.out.println("Dentro do 'Do While': "+ contador++);
        }while (contador < 10);{
//            System.out.println(contador++);
        }

        for(int i=0; i<10; i++){
            System.out.println("Valor de i: "+i);
            if(i==5){
                break;
            }
        }
    }
}
