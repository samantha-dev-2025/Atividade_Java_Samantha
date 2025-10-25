import java.util.Scanner;

public class CalculoMedia {
    public static void main(String arg[]){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite nota 1: ");

        Double n1 = input.nextDouble();

        System.out.println("Digite nota 2: ");

        Double n2 = input.nextDouble();

        System.out.println("Digite nota 3: ");

        Double n3 = input.nextDouble();

        Double media = (n1+n2+n3)/3;

        System.out.println("Sua média é: "+media);


    }
}