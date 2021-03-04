package exception_handling;

public class ThrowKeyword {

    public static void main(String[] args) {
        int i=18;

        try {
            if(i>18){
                System.out.println("you can vote");
            }else {
                throw new Exception("You can not vote");
            }
        }catch (Exception exception){
            System.out.println(exception);
        }

    }
}
