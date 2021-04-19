package enumdemo;

import java.util.EnumMap;
import java.util.Map;

public class EnumMapDemo {
    enum Color{
        WHITE,BLACK,ORANGE,BLUE
    }


    public static void main(String[] args) {
        EnumMap<Color,Integer> enumMap = new EnumMap<Color, Integer>(Color.class);
        enumMap.put(Color.BLACK,1);
        enumMap.put(Color.WHITE,3);
        enumMap.put(Color.ORANGE,56);

        for (Map.Entry m: enumMap.entrySet()) {
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
