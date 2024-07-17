package section13.practice.p04;

interface ButtonClicklistener {
    void onClick();
}

public class Practice1304 {
    public static void simulateButtonClick(ButtonClicklistener listener) {
        listener.onClick();
    }

    public static void main(String[] args) {
        ButtonClicklistener button = new ButtonClicklistener() {
            @Override
            public void onClick() {
                System.out.println("Button cliked!");
            }
        };
        simulateButtonClick(button);
    }
}
