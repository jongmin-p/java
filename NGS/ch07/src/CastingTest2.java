public class CastingTest2 {
    public static void main(String[] args) {

        Car3 car = new Car3();
        Car3 car3 = null;
        FireEngine2 fe = null;

        car.drive();
        fe = (FireEngine2) car;     // 컴파일은 OK.     하지만, 실행 시 에러가 발생함.

        fe.drive();
        car3 = fe;
        car3.drive();
    }
}


class Car3 {
    String color;
    int door;

    void drive() {
        System.out.println("drive,Brrrrrr ~");
    }

    void stop() {
        System.out.println("stop!!!");
    }
}


class FireEngine2 extends Car3 {      // 소방차
    void water() {
        System.out.println("water!!!");
    }
}