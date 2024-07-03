package section18;

public class Ex1803 {
    public static void main(String[] args) {

        System.out.println(String.format("I eat %d apples.", 5));

        System.out.printf("I eat %d applse\n", 5);
        System.out.printf("I eat %f applse\n", 2.5);
        System.out.printf("I eat %.2f applse\n", 2.5);
        System.out.printf("I eat %s applse\n", "five");
        System.out.printf("I eat %s applse\n", 2.5);

        System.out.printf("I have completed %d%% of my java studies.\n", 100);
        System.out.printf("I have completed %d%% of my %s studies.\n", 100, "java");
        System.out.printf("I have completed %3d%% of my %s studies.\n", 90, "java");
        System.out.printf("I have completed %-3d%% of my %s studies.\n", 90, "java");
        System.out.printf("I have completed %.2f%% of my %s studies.\n", 99.99999, "java"); //반올림

    }
}
