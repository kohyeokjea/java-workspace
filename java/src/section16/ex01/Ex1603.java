package section16.ex01;

class NumberBox<T> {
    T item;

    public T getItem() {
        return this.item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}

public class Ex1603 {
    public static void main(String[] args) {
        NumberBox<Integer> numberBox = new NumberBox<Integer>();
        numberBox.setItem(10);

        System.out.println(numberBox.getItem());

        NumberBox<String> numberBox1 = new NumberBox<>();
        numberBox1.setItem("20");

        System.out.println(numberBox1.getItem());

        System.out.println(numberBox.getItem() + numberBox1.getItem());
        System.out.println(numberBox.getItem() + numberBox.getItem());

    }
}
