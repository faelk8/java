package br.com.introducao.controlefluxo;

public class ControleFluxoTernario {
    public static void main(String[] args) {
        int idade = 20;
        String status;
        status = idade < 18 ? "Infantil" : "Adulto";
        System.out.println(status);

        // Complicando
        status = idade < 15 ? "Infantil" : idade >=15 && idade <= 18 ? "Juvenil": "Adulto";
        System.out.println(status);
    }
}
