package section05;

public class JumpEx0505 {
    public static void main(String[] args) {
        int[] marks = { 90, 25, 67, 45, 80 };

        for (int i = 0; i < marks.length; i++) {
            if (marks[i] > 60) {
                System.out.println((i + 1) + "번 학생은 합격입니다.");
            } else {
                System.out.println((i + 1) + "번 학생은 불합격입니다.");
            }
        }
        System.out.println();
        
        int i = 1;
        for (int mark : marks) {
            if (mark > 60) {
                System.out.println(i + "번 학생은 합격입니다.");
            } else {
                System.out.println(i + "번 학생은 불합격입니다.");
            }
            i++;
        }
    }
}
