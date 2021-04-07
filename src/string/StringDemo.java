package string;

public class StringDemo {

    public static void main(String[] args) {

        char[] arr  = {'p','u','n','e'};

        String str= new String(arr);
//        String str2= new String("kolhapur");
        System.out.println(str);

        String str1 ="Mumbai ";
        System.out.println(str1);
        System.out.println(str1.length());
        System.out.println(str1.trim());
        System.out.println(str1.toLowerCase());
        System.out.println(str1.toUpperCase());
        System.out.println(str1.charAt(1));


        String str3 = "Java";
        String str4 = "Java";
        String str5 =  new String("java");
        String str6 =  new String("java");
        
        System.out.println(str6 == str5);// reference

        System.out.println(str3.equals(str5));//value

        System.out.println(str3.equalsIgnoreCase(str5));//value


    }
}
