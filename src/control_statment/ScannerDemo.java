package control_statment;


import java.util.Scanner;

public class ScannerDemo {

    public static void main(String[] args) {

        int i;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number");
        i = scanner.nextInt();

        System.out.println("i value"+i);
    }
}
