package string;

public class StringReverse {

    public static void main(String[] args) {

        String str ="JavaProgramming";

        String rev = "";

        for(int i = str.length()-1;i>=0;i--){
            rev = rev + str.charAt(i);
        }

        System.out.println("String reverse=>"+rev);

    }

}
