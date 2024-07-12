package section10.access.ex01;

class Sample {
    private String secret;

    protected String geSecret() {
        return this.secret;
    }

    protected String geSecret(String secret) {
        this.secret = secret;
        return this.secret;
    }
}

public class JumpEx1005 {
    public static void main(String[] args) {
        Sample s = new Sample();
        // System.out.println(s.secret);
        System.out.println(s.geSecret("private"));
    }
}
