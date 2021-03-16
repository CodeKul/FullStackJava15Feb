package static_keyword;

public class OuterInnerClass {

    public static void main(String[] args) {

        Outer outer = new Outer();
        outer.show();

//        Outer.Inner inner = outer.new Inner();
//        Outer.Inner inner1 = new Outer.Inner();
    }

}

class Outer {

    int i = 10;

    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.innerShow();
    }

    public void show() {
        System.out.println(i);
    }

    //static
    private class Inner {
        int i = 18;

        public void innerShow() {
            System.out.println(i);
        }
    }
}