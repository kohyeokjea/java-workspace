package section16.ex03;

import java.util.Arrays;
import java.util.HashSet;

public class JumpEx1605 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        set.add("Jump");
        System.out.println(set);

        set.addAll(Arrays.asList("to", "Java"));
        set.addAll(Arrays.asList("to", "Java"));
        set.addAll(Arrays.asList("to", "Java")); // 중복 허용 X
        System.out.println(set);

        set.remove("to");
        System.out.println(set);

        System.out.println(set.size());
    }
}
