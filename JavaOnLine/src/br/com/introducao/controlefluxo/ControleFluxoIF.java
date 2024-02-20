package br.com.introducao.controlefluxo;

public class ControleFluxoIF {
    public static void main(String[] args) {
        /*
        idade < 15 categoria infantil
        idade >= 15 && idade < 18 juvenil
        idade >= 18 adulto
        */
        int idade = 20;
        String categoria;

        if (idade < 15){
//            System.out.println("Categoria Infantil");
            categoria = "Infantil";
        }else if(idade >=15 && idade <= 18){
//            System.out.println("Categira Juvenil");
            categoria = "Juvenil";
        }else{
//            System.out.println("Categoria Adulto");
            categoria = "Adulto";
        }
        System.out.println(categoria);

        // Da para substituir tudo por um operador ternario
        String status;
        status = idade < 15 ? "Infantil" : idade >=15 && idade <= 18 ? "Juvenil": "Adulto";
        System.out.println(status);
    }
}
