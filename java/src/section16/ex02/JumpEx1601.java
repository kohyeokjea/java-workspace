package section16.ex02;

import java.util.ArrayList;

public class JumpEx1601 {
    public static void main(String[] args) {
        ArrayList<String> pitches = new ArrayList<>();
        
        pitches.add("138");
        pitches.add("129");
        pitches.add("142");

        System.out.println(pitches);
        System.out.println(pitches.get(0));
        System.out.println(pitches.get(1));

        System.out.println(pitches.contains("142"));
        // System.err.println(pitches.contains(142));  // false
        System.out.println(pitches.remove("142")); // true 라고 나옴
        System.out.println(pitches);

        System.out.println(pitches.remove(1)); // 129
        System.out.println(pitches);
    }
}
