package section10.ex05;

public class JumpEx1004 {
    public static void main(String[] args) {
        HouseDog houseDog = new HouseDog("Poppy");
        houseDog.sleep();
        houseDog.guardHouse();

        Dog dog = houseDog;

        // dog.guardHouse(); // 사용불가
        dog.sleep(); //
    }
}
