public class Sample{

    //primitive datatype
    int i=0;
    long l = 0L;
    char c= 'C';
    boolean b = false;
    float f= 0.1F;
    double d = 0.2;
    byte bt = 9;
    short s = 1;


    //non primitive datatypes

    Integer integer =9;
    Long aLong= 9L;
    Short aShort = 0;
    Float aFloat = 6.8F;
    Double dADouble = 12.0;
    Character character ='c';
    Boolean aBoolean =false;
    Byte aByte = 21;

    String s1 ="Sahil";

    public void show(){
        System.out.println("Hello");
    }

    public int dispaly(){
       return 3;
    }
    //public - access modifier
    //static - JVM instantiate without creating the object of class

    //test code for git pull
    public static void main(String[] args) {

        Sample sample = new Sample();
        sample.show();
    }

}
