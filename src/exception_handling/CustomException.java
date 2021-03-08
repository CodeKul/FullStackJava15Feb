package exception_handling;

public class CustomException {


    public static void main(String[] args) throws Exception {
        int i = 18;


        if (i <= 18) {
            throw new MyException("You can not vote");
        }
    }
}

class MyException extends Exception{

    MyException(String msg){

        super(msg);
    }

}



