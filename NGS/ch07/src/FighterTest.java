public class FighterTest {
    public static void main(String[] args) {

    	/*
    	 	Unit 	  u = new Fighter();
    	 	Fightable f = new Fighter();

    	 	둘 다 가능하지만, 사용할 수 있는 멤버가 다르다.
    	 	각 참조변수에 선언된 것들만 사용 가능
    	 */


        Fighter f = new Fighter();


        if (f instanceof Unit) {
            System.out.println("f 는 Unit 클래스의 자손입니다.");
        }
        if (f instanceof Fightable) {
            System.out.println("f 는 Fightable 인터페이스를 구현했습니다.");     	// Fightable 이 Movable 이랑 Attackable 상속받았으니,
        }                                                                       // Fightable 인터페이스를 구현한 Fighter 에서 추상메서드들을 전부 구현했음.
        if (f instanceof Movable) {
            System.out.println("f 는 Movable 인터페이스를 구현했습니다.");
        }
        if (f instanceof Attackable) {
            System.out.println("f 는 Attackable 인터페이스를 구현했습니다.");
        }
        if (f instanceof Object) {
            System.out.println("f 는 Object 클래스의 자손입니다.");             	// 최고 조상
        }
    }       // main
}


////////////////////////////////////////////////////////////////////


class Fighter extends Unit implements Fightable {
    // Unit 을 상속받았으니 Unit 의 멤버들도 가지고 있음.
    // 그리고 구현하려는 Fightable 은  Movable 과 Attackable 을 상속받고 있으므로,  그 둘의 추상 메서드들을 전부 여기서 구현해야 함.

    public void move(int x, int y) { /* 내용 생략 */ }
    public void attack(Unit u) 	   { /* 내용 생략 */ }
}


class Unit {
    int currentHP;      // 유닛의 체력
    int x;              // 유닛의 위치 (x 좌표)
    int y;              // 유닛의 위치 (y 좌표)
}


////////////////////////////////////////////////////////////////////


//Fightable 은  Movable 과 Attackable 을 상속받고 있다.
interface Fightable extends Movable, Attackable { }

interface Movable {
    void move(int x, int y);
}

interface Attackable {
    void attack(Unit u);
}