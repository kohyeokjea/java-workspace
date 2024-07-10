package section08;

public class Animal {
    // 멤버(인스턴스 == 객체, 정적): 속성, 기능
    // 속성: 필드 (변수, 상수)
    // 기능: 메서드 (메서드)

    // 객체명 != 객체 변수

    // String name = "Navi";
    String name;
    // name = "Navi"; 이 방법으로 초기화 불가

    public void setName(String name) {
        this.name = name;
    }

    // 클래스(class) == 설계도(청사진)
    // - 멤버(인스턴스)
    // + 필드 == 속성
    // +변수
    // +상수
    // + 메서드 == 기능

    // - static(정적)

    // 객체(Object)
}
