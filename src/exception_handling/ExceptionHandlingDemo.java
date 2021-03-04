package exception_handling;

public class ExceptionHandlingDemo {

    public static void main(String[] args) {

        int i = 10;

        try {
//            try {
//                int j = i / 0;
//            } catch (Exception e) {
//                System.out.println(e);
//            }
//            String s = null;
//            System.out.println(s.length());
//            System.out.println(j);

        } catch (Exception e) {
            System.out.println("runtime=>" + e.getMessage());
        } finally {

            System.out.println("In Finally");
        }


    }
}
