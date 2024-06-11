class Card222 {
    String kind;
    int number;

    Card222() {
        this("SPADE", 1);
    }

    Card222(String kind, int number) {
        this.kind = kind;
        this.number = number;
    }

    // Object 클래스로부터 상속받은 toString() 오버라이딩
    @Override
    public String toString() {
        return "Card{" +
                "kind = '" + kind + '\'' +
                ", number = " + number +
                '}';
    }
}


public class CardToString2 {

    public static void main(String[] args) {
        Card222 card1 = new Card222();
        Card222 card2 = new Card222("HEART", 10);

        // 이번에는,    Card222 클래스에서 toString() 을 오버라이딩 했기 때문에, 좀 더 유용한 데이터를 출력했다.
        System.out.println(card1.toString());
        System.out.println(card2.toString());
    }
}