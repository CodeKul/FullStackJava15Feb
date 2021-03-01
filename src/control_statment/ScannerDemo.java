package control_statment;


import java.util.Scanner;

public class ScannerDemo {

    public static void main(String[] args) {

        long i;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number");
        i = scanner.nextLong();

        System.out.println("i value"+i);
    }
}
