package control_statment;

public class IfElseDemo {
    public static void main(String[] args) {
        int i = 0;
        //single if else
        if (i > 0) {
            System.out.println("number is positive");
        } else {
            System.out.println("Number is negative");
        }


        //multiple if else
        int a = 101, b = 205, c = 30;

        if (a > b && a > c) {
            System.out.println("a is greater");
        } else if (b > c) {
            System.out.println("b is greater");
        } else {
            System.out.println("c greater ");
        }


        //Nested if
        int age = 18;
        String nationality = "Indian";

        if (age >= 18) {
            if (nationality == "Indian") {
                System.out.println("You can vote");
            } else {
                System.out.println("You are not indian");
            }
        } else {
            System.out.println("You can not vote");
        }

        int s = i > 0 ? 100 : 200;

        String w = i > 0 ? "i is positive" : "i is negative";

        System.out.println(s);
    }
}
