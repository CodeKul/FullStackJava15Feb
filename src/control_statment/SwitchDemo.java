package control_statment;

import java.util.Scanner;

public class SwitchDemo {

    public static void main(String[] args) {

        int i;
        int j;
        char operators;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number ");
        i = scanner.nextInt();
        System.out.println("Enter the second number");
        j = scanner.nextInt();

        System.out.println("Enter operator");
        operators = scanner.next().charAt(0);

        float output = 0.0F;

        switch (operators) {
            case '+':
                output = i + j;
                break;
            case '-':
                output = i - j;
                break;
            case '*':
                output = i * j;
                break;
            case '/':
                output = i / j;
                break;
            default:
                System.out.println("Not valid");
        }

        System.out.println(i + " " + operators + " " + j + "=" + output);
    }
}

