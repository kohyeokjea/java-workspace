package section16.ex02;

import java.util.ArrayList;
import java.util.Arrays;

public class JumpEx1603 {
    public static void main(String[] args) {
        ArrayList<String> pitches = new ArrayList<>(Arrays.asList("138", "129", "142"));

        String result = "";
        for (int i = 0; i < pitches.size(); i++) {
            result += pitches.get(i);
            result += ",";
        }

        System.out.println(result.substring(0, result.length() - 1));

        result = "";
        for (String pitche : pitches) {
            result += pitche;
            result += ",";
        }

        System.out.println(result.substring(0, result.length() - 1));
        
        result = String.join("-", pitches);
        System.out.println(result);
    }
}
