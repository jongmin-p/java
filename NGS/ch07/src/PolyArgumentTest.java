public class PolyArgumentTest {
    public static void main(String[] args) {

        Buyer b = new Buyer();

        b.buy(new Tv6());
        b.buy(new Computer3());

        System.out.println("현재 남은 돈은 " + b.money + " 만원 입니다.");
        System.out.println("현재 남은 보너스 점수는 " + b.bonusPoint + " 점 입니다.");
    }
}


class Product {
    int price;
    int bonusPoint;

    Product(int price) {
        this.price = price;
        bonusPoint = (int)(price/10.0);
    }
}


class Tv6 extends Product {
    Tv6() {
        // 조상클래스의 생성자 Product(int price) 를 호출한다.
        super(100);    // Tv 의 가격을 100만원으로 한다.
    }

    public String toString() {
        return "Tv";
    }
}


class Computer3 extends Product {
    Computer3() {
        super(200);
    }

    public String toString() {
        return "Computer";
    }
}


class Buyer {
    int money = 1000;
    int bonusPoint = 0;

    void buy(Product p) {
        if (money < p.price) {
            System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
            return ;
        }

        money -= p.price;
        bonusPoint += p.bonusPoint;

        // 참조 변수인 p 를 출력하는 것은 p.toString() 을 출력하는 것과 같음 (교재 p. 326 참고)
        System.out.println(p + " 을/를 구입하셨습니다.");
    }
}