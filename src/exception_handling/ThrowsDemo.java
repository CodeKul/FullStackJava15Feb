package exception_handling;

public class ThrowsDemo {

    public static void main(String[] args) throws Exception {
        int i = 18;


        if (i > 18) {
            System.out.println("you can vote");
        } else {
            throw new Exception("You can not vote");
        }
    }
}

