package br.com.introducao.exercicio;

public class ExercicioControleFluxo3 {
    public static void main(String[] args) {
        int valor = 100000;
        for (int i = 0; i <= valor; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

//        Calculando a parcela
        double valorTotal = 30000;
        for (int parcela = 1; parcela <= valorTotal; parcela++) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000) {
                break;
            } else {
                System.out.println("Parcela " + parcela + " R$ " + valorParcela);
            }
        }

        valorTotal = 30000;
        for (int parcela = (int) valorTotal; parcela >= 1; parcela--) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela <= 1000) {
                continue; // Economiza a memoria
            }
            System.out.println("Parcela " + parcela + " R$ " + valorParcela);
        }

    }
}
