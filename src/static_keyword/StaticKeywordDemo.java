package static_keyword;

public  class StaticKeywordDemo {

    static final String companyName;

    static {
        System.out.println("In static block");
        companyName = "abc";
    }

    int id;
    String name;

    public static void show() {
        System.out.println("In static method");
    }

    public static void main(String[] args) {

        StaticKeywordDemo.show();

        StaticKeywordDemo obj1 = new StaticKeywordDemo();
        obj1.id = 1;
        obj1.name = "sagar";

        StaticKeywordDemo obj2 = new StaticKeywordDemo();
        obj2.id = 2;
        obj2.name = "Suhas";

        System.out.println();
        System.out.println("Id=>" + obj1.id + " Name=>" + obj1.name + " comapnyName=>" + companyName);
        System.out.println("Id=>" + obj2.id + " Name=>" + obj2.name + " comapnyName=>" + companyName);
    }

}
