package final_keyword;

public class FinalKeywordDemo {
//Final classes can not inherited

   final int i =10;//final variable

    public final void show(){//final method are not override
        System.out.println(i);
    }

    public static void main(String[] args) {

        final int i;
        i=10;

//        i=90;

        FinalKeywordDemo finalKeywordDemo = new FinalKeywordDemo();

        finalKeywordDemo.show();
    }
}

class FinalKeywordOverriding extends FinalKeywordDemo{

//    int i =17;

//    @Override
//    public void show() {
//        System.out.println(i);
//    }

    public static void main(String[] args) {
        FinalKeywordOverriding obj = new FinalKeywordOverriding();
        obj.show();
    }
}