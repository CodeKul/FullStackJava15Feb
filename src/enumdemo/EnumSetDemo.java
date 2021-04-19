package enumdemo;

import java.util.EnumSet;
import java.util.Set;

public class EnumSetDemo {

    enum Color{
        WHITE,BLACK,ORANGE,BLUE
    }
    public static void main(String[] args) {
        Set<Color> set = EnumSet.of(Color.WHITE,Color.ORANGE);
        Set<Color> colorSet = EnumSet.allOf(Color.class);

        colorSet.forEach(s->{
            System.out.println(s);
        });
    }
}
