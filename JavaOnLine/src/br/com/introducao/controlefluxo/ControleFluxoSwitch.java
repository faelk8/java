package br.com.introducao.controlefluxo;

public class ControleFluxoSwitch {
    public static void main(String[] args) {
//        char, int, byte, short, enum e string
        byte dia = 2;
        switch (dia) {
            case 1:
                System.out.println("domingo");
                break;
            case 2:
                System.out.println("segunda");
                break;
            case 3:
                System.out.println("terça");
                break;
            case 4:
                System.out.println("quarta");
                break;
            case 5:
                System.out.println("quinta");
                break;
            case 6:
                System.out.println("sexta");
                break;
            case 7:
                System.out.println("sabado");
                break;
        }

        String sexo = "F";
        switch (sexo) {
            case "F":
                System.out.println("Feminino");
                break;
            case "M":
                System.out.println("Masculino");
                break;
            default:
                System.out.println("Opção inválida");
        }
    }
}
