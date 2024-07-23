package section16.ex03;

import java.util.Arrays;
import java.util.HashSet;

public class JumpEx1604 {
    public static void main(String[] args) {
        HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        HashSet<Integer> s2 = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8, 9));

        System.out.println(s1);
        System.out.println(s2);

        HashSet<Integer> intersection = new HashSet<>(s1);
        intersection.retainAll(s2); // retainAll: 교집합
        System.out.println(intersection);

        HashSet<Integer> union = new HashSet<>(s1);
        union.addAll(s2); // retainAll: 합집합
        System.out.println(union);

        HashSet<Integer> substract = new HashSet<>(s1);
        substract.removeAll(s2); // retainAll: 차집합
        System.out.println(substract);

        HashSet<Integer> substract1 = new HashSet<>(s2);
        substract1.removeAll(s1); // retainAll: 차집합
        System.out.println(substract1);
    }
}
