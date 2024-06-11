class Card {
    String kind;
    int number;

    Card() {
        this("SPADE", 1);
    }

    Card(String kind, int number) {
        this.kind = kind;
        this.number = number;
    }
}


public class CardToString {

    public static void main(String[] args) {
        Card card1 = new Card();
        Card card2 = new Card();

        // Card 클래스에서 toString() 을 오버라이딩 하지 않아서,
        // Object 클래스에 정의된 toString() 을 그대로 사용했다.
        // 그래서 클래스명@해시코드(주소값) 만 출력됨.    (아직, 개발자에게 유용한 데이터는 아님)
        System.out.println(card1.toString());
        System.out.println(card2.toString());
    }
}