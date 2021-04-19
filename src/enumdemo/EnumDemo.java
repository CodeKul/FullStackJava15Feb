package enumdemo;

public class EnumDemo {
    enum Color{
        WHITE(1),ORANGE(5),BLACK(0),RED(7);

        int vl;
        Color(int v){
            this.vl = v;
        }
    }
    public static void main(String[] args) {
        for (Color c:Color.values()) {
            System.out.println(c+ " "+c.vl);
        }
        System.out.println(Color.valueOf("ORANGE").ordinal());
    }
}
