package section09.Practice.Practice02;

// 이름: 김일남, 학년: 0, 성적: 0
// 이름: 김이남, 학년: 3, 성적: 0
// 이름: 김삼남, 학년: 2, 성적: 85

class Studnet {
    String name;
    int grade;
    int score;

    Studnet(String name) {
        this.name = name;
    }
    Studnet(String name, int grade){
        this.name =name;
        this.grade =grade;
    }
    Studnet(String name, int grade, int score){
        this.name = name;
        this.grade = grade;
        this.score = score;
    }

    void printInfo() {
        System.out.println("이름: " + name + ", 학년: " + grade + ", 성적: " + score);
    }

}

public class Practice0902 {
    public static void main(String[] args) {
        Studnet studnet1 = new Studnet("김일남");
        Studnet studnet2 = new Studnet("김이남", 3);
        Studnet studnet3 = new Studnet("김삼남", 2, 85);

        studnet1.printInfo();
        studnet2.printInfo();
        studnet3.printInfo();
    }
}
