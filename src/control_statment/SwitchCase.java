package control_statment;

import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {
        int i;
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter number");
        i=scanner.nextInt();

        switch (i) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            default:
                System.out.println("Not found");
        }
    }
}
