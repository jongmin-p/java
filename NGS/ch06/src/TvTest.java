public class TvTest {
    public static void main(String[] args) {
        Tv t;               // Tv 인스턴스를 참조하기 위한 변수 t 를 선언.
        t = new Tv();       // Tv 인스턴스를 생성한다.

        t.channel = 7;      // Tv 인스턴스의 멤버 변수 channel 의 값을 7 로 한다.
        t.channelDown();    // Tv 인스턴스의 메서드 channelDown() 을 호출한다.
        System.out.println("현재 채널은 " + t.channel + " 입니다.");
    }
}


class Tv {
    // Tv의 속성 (멤버 변수)
    boolean power;      // 전원 상태 (on/off)
    int channel;        // 채널
    String color;       // 색상


    // Tv의 기능 (메서드)
    void power() {      // TV를 켜거나 끄는 기능을 하는 메서드
        power = !power;
    }

    void channelUp() {  // TV의 채널을 높이는 기능을 하는 메서드
        ++channel;
    }

    void channelDown() {  // TV의 채널을 낮추는 기능을 하는 메서드
        --channel;
    }
}