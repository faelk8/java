public class ExercicioControleFluxo {
    public static void main(String[] args) {
        double salario = 2000;
        double tatalImposto = 0;

        if (salario < 1000){
            tatalImposto = salario * 0.05;
        }else if(salario >= 1000 && salario < 2000){
            tatalImposto = salario * 0.1;
        }else if(salario >= 2000 && salario < 4000){
            tatalImposto = salario * 0.15;
        }else{
            tatalImposto = salario * 0.2;
        }
        System.out.println("Tota do imposto é: "+tatalImposto);

        double imposto = 0;
        imposto = salario < 1000 ? salario * 0.05 : salario >= 1000 && salario < 2000 ? salario * 0.1 : salario >= 2000 && salario < 4000 ? salario * 0.15 : salario * 0.2;
        System.out.println("Tota do imposto é: "+imposto);
    }
}
