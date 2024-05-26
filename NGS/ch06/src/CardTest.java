public class CardTest {
    public static void main(String[] args) {
        System.out.println("Card.width = " + Card.width);
        System.out.println("Card.height = " + Card.height);
        System.out.println();

        Card c1 = new Card();
        c1.kind = "Heard";  // 인스턴스 변수의 값 변경
        c1.number = 7;

        Card c2 = new Card();
        c2.kind = "Spade";  // 인스턴스 변수의 값 변경
        c2.number = 4;

        System.out.println("c1 은 " + c1.kind + ", " + c1.number + " 이며, 크기는 (" + c1.width + ", " + c1.height + ") 입니다.");
        System.out.println("c2 은 " + c2.kind + ", " + c2.number + " 이며, 크기는 (" + c2.width + ", " + c2.height + ") 입니다.\n");

        System.out.println("c1 의 width 와 height 를 각각 50, 80 으로 변경합니다.\n");
        Card.width = 50;     // 클래스 변수의 값 변경 (클래스 변수의 경우, 인스턴스명을 적는 대신 대부분 '클래스명.클래스변수' 를 사용한다)
        Card.height = 80;

        System.out.println("c1 은 " + c1.kind + ", " + c1.number + " 이며, 크기는 (" + c1.width + ", " + c1.height + ") 입니다.");
        System.out.println("c2 은 " + c2.kind + ", " + c2.number + " 이며, 크기는 (" + c2.width + ", " + c2.height + ") 입니다.\n");
    }
}


class Card {
    String kind;    // iv
    int number;     // iv

    static int width = 100;  // cv
    static int height = 250; // cv
}