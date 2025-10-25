import java.util.Scanner;

public class ConversaoIdade {
    public static void main(String arg[]){
        Scanner input = new Scanner(System.in);

        System.out.println("Informe a sua Idade: ");

        Integer idade = input.nextInt();
        Integer meses = idade * 12;
        Integer dias = idade * 365;

        System.out.println("Idade: "+idade+" anos!");

        System.out.println("Equivalente a: "+meses+" meses e "+dias+" dias.");


    }
}