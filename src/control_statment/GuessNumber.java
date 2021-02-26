package control_statment;

import java.util.Scanner;
 public class GuessNumber {

    public static void main(String[] args) {

        int number;
        int random;
        int trials=0;

        Scanner scanner =new Scanner(System.in);
        System.out.println("Guess the number btw 1 to 100");

        random = (int)(Math.random()*100+1);

        do{
            System.out.println("Enter the number");
            number = scanner.nextInt();

            trials++;
            if(random>number){
                System.out.println("number is High");
            }else if (random<number){
                System.out.println("Nummber is Low");
            }else {
                System.out.println("Number is correct and guessing trials are=>"+trials);
            }

        }while (random!=number);

    }
}
