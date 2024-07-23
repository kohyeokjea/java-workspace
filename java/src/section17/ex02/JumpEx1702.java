package section17.ex02;

class Sample extends Thread {
    int seq;

    public Sample(int seq) {
        this.seq = seq;
    }

    @Override
    public void run() {
        System.out.println(this.seq + " thread start.");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(this.seq + " thread end.");
    }
}

public class JumpEx1702 {
    public static void main(String[] args) {
        Thread t = new Sample(1);
        t.start();

        try {
            t.join();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("main end.");
    }
}
