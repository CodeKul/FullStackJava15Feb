package string;

public class StringBufferDemo {

    public static void main(String[] args) {


        //String Buffer is Mutable Object
        StringBuffer stringBuffer = new StringBuffer("JavaProgramming");
//        stringBuffer.append("Programming");
//        System.out.println(stringBuffer.reverse());
//        System.out.println(stringBuffer.charAt(1));
        System.out.println(stringBuffer.capacity());
        System.out.println(stringBuffer.delete(0,3));
    }
}
