public class CastingTest1 {
    public static void main(String[] args) {

        Car car = null;
        FireEngine fe = new FireEngine();
        FireEngine fe2 = null;

        fe.water();     // 출력!
        car = fe;               	// car = (Car) fe;  에서 그냥 형변환이 생략된 거임. (업캐스팅)
        // car.water();         	// 컴파일 에러!!! Car 타입의 참조변수로는 water() 를 호출할 수 없다.

        fe2 = (FireEngine)car;  	// (FireEngine) 사실 이 형변환이 하는 일은 없다. 그냥 양 쪽의 타입을 일치시키려고 작성하는 것.
        fe2.water();     // 출력!
    }
}


class Car {
    String color;
    int door;

    void drive() {
        System.out.println("drive,Brrrrrr ~");
    }

    void stop() {
        System.out.println("stop!!!");
    }
}


class FireEngine extends Car {      // 소방차
    void water() {
        System.out.println("water!!!");
    }
}