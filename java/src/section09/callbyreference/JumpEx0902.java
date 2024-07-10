package section09.callbyreference;

class Updater {
    void updater(Counter counter) {
        counter.count++;
        System.out.println("update - myCounter.count:\t\t" + counter.count);
    }
}

class Counter {
    int count = 0;
}

public class JumpEx0902 {
    public static void main(String[] args) {
        Counter myCounter = new Counter();
        System.out.println("before - myCounter.count:\t" + myCounter.count);

        Updater myUpdater = new Updater();
        myUpdater.updater(myCounter);
        System.out.println("after - myCounter.count:\t\t" + myCounter.count);
    }
}
