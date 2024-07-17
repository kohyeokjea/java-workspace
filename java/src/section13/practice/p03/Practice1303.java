package section13.practice.p03;

class OuterLocal {
    void display() {
        String localMessage = "Hello, local inner class!";

        class localInner {
            void print() {
                System.out.println(localMessage);
            }
        }

        localInner localInner = new localInner();
        localInner.print();

    }
}

public class Practice1303 {
    public static void main(String[] args) {
        OuterLocal outerLocal = new OuterLocal();

        outerLocal.display();
    }
}
