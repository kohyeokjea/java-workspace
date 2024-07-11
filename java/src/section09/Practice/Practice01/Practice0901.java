package section09.Practice.Practice01;

// 이름: 김일남, 성적: 85
// 이름: 김이남, 성적: 92

class Studnet {
    String name;
    int score;

    Studnet(String name) {
        this.name = name;
    }

    void setSocre(int score) {
        this.score = score;
    }

    void printInfo() {
        System.out.println("이름: " + name + ", 성적: " + score);
    }
}

public class Practice0901 {
    public static void main(String[] args) {
        Studnet student1 = new Studnet("김일남");
        Studnet student2 = new Studnet("김이남");

        student1.setSocre(85);
        student2.setSocre(92);

        student1.printInfo();
        student2.printInfo();
    }
}
