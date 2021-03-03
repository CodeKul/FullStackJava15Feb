package exception_handling;

public class ExceptionHandlingDemo {

    public static void main(String[] args) {

        int i=10;

        try{
//            int j = i/0;

            String s = null;
            System.out.println(s.length());
//            System.out.println(j);

        }catch (Exception e){
            System.out.println("runtime=>"+e.getMessage());
        }

        System.out.println("Hello");

    }
}
