package section10.access.ex03;

import section10.access.ex02.HouseKimDefault;

class HouseKimProtectedChilde extends HouseKimDefault {
    String lastname = super.lastname;
}

public class JumpEx1007 extends HouseKimDefault {
    public static void main(String[] args) {
        // HouseKimDefault kim = new HouseKimDefault();
        // System.out.println(kim.lastname);
        HouseKimProtectedChilde kim = new HouseKimProtectedChilde();
        System.out.println(kim.lastname);

        JumpEx1007 kim2 = new JumpEx1007();
        System.out.println(kim2.lastname);
    }
}
