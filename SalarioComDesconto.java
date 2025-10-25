public class SalarioComDesconto {
    public static void main(String arg[]){
        Integer hora = 100;
        Integer horasMensal = 168;
        Integer salario = hora*horasMensal;
        Double inss = salario*0.08;
        Double ir = salario*0.11;
        Double sindicato = salario*0.05;

        System.out.println("Salário: "+(salario));
        System.out.println("INSS: "+(inss));
        System.out.println("Sindicato: "+(sindicato));
        System.out.println("Salário Líquido: "+(salario-inss-sindicato));
    }
}