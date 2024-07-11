package section10;

public class JumpEx1001 {
    public static void main(String[] args) {
        Animal a = new Animal();

        a.setName("비밀");
        System.out.println(a.name);

        System.out.println(a.hashCode());

        Dog d = new Dog("Happy"); // 객체명, 참조 변수

        // d.setName("Happy");
        // System.out.println(d.name);
        d.sleep();
    }
}
