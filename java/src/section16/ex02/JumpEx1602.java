package section16.ex02;

import java.util.ArrayList;
import java.util.Arrays;

public class JumpEx1602 {
    public static void main(String[] args) {
        String[] data = { "138", "129", "142" };
        System.out.println(data);

        ArrayList<String> pitches1 = new ArrayList<>(Arrays.asList(data));
        System.out.println(pitches1);

        ArrayList<String> pitches2 = new ArrayList<>(Arrays.asList("138", "129", "142"));
        System.out.println(pitches2);
    }
}
