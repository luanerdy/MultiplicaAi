import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Digite um numero:");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        System.out.println("\n");

        System.out.println("Tabela de multiplicação de " + number);

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}
