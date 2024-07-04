package section04;

public class Practice0404 {
    public static void main(String[] args) {
        // DB에 존재하는 아이디와 비밀번호
        String isUsername = "admin";
        String isPassword = "password123";

        String username = "admin";
        String passward = "password123";

        if (username == isUsername && isPassword.equals(passward)) {
            System.out.println("로그인 성공");
        } else {
            System.out.println("로그인 실패");
        }

    }
}
