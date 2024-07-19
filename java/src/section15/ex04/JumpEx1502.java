package section15.ex04;

public class JumpEx1502 {
    public static void main(String[] args) {
        String result = "";
        result += "hello";
        result += " ";
        result += "Jump to Java";

        System.out.println(result);

        StringBuilder sb = new StringBuilder();

        System.out.println(sb);
        sb.append("hello");
        sb.append(" ");
        sb.append("Jump to Java");

        sb.insert(5, ",");

        sb.replace(15, sb.length(), "jAVA");
        sb.replace(15, 15, "Python");

        sb.delete(15, 21);

        System.out.println(sb);

        System.out.println(sb.substring(7));
        System.out.println(sb.substring(7, 11));

        sb.substring(7, 11);
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

    }
}
