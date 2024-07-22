package section15.ex02;

import java.util.Objects;

class NewPerson {
    String name;
    int age;

    NewPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        // if(obj == null || getClass() != obj.getClass() ){
        //      return false;
        // }

        if (!(obj instanceof NewPerson)) {
            return false;
        }
        NewPerson person = (NewPerson) obj;
        // return age == person.age && name == person.name;
        return age == person.age && name.equals(person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age); // 주어진 객체를 기반으로 해시코드를 간편하게 생성
    }

    @Override
    public String toString() {
        return "Person{name = " + name + ", age = " + age + "}";
    }
}

public class Ex1506 {
    public static void main(String[] args) {
        NewPerson p1 = new NewPerson("김일남", 99);
        NewPerson p2 = new NewPerson("김일남", 99);
        NewPerson p3 = p1;
        NewPerson p4 = new NewPerson("김이남", 99);

        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));

        // p1.name = "김이남";

        // System.out.println(p1.equals(p4));

        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p3.hashCode());
        System.out.println(p4.hashCode());

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
}
