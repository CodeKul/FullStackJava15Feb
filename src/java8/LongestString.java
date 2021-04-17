package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class LongestString {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("java","is","Programming","Language");

        String str = "";
        int longest = 0;

        for(String st:stringList){
            if(st.length()>longest){
                longest = st.length();
                str = st;
            }
        }

        System.out.println(str);
        //reduce produce a single value result
        String st = stringList.stream().reduce((s1, s2)-> s1.length()>s2.length()?s1:s2).get();
        System.out.println(st);

        List<Integer> add = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        int sum=0;
        for(Integer i:add){

            sum = sum+i;
        }
        System.out.println(sum);

        Optional<Integer> sum1 = add.stream().reduce((e1,e2)->e1+e2);
        System.out.println(sum1);
    }
}
