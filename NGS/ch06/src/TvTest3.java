public class TvTest3 {
    public static void main(String[] args) {
        Tv t1 = new Tv();       // Tv t1;       t1 = new Tv();      이걸 한 문장으로 만듦.
        Tv t2 = new Tv();

        System.out.println("t1 의 channel 값은 " + t1.channel + " 입니다.");
        System.out.println("t2 의 channel 값은 " + t2.channel + " 입니다.\n");

        t2 = t1;                // t1 이 저장하고 있는 주소값을 t2 에다가 저장한다.

        t1.channel = 7;
        System.out.println("t1 의 channel 값을 7 로 변경하였습니다.\n");

        System.out.println("t1 의 channel 값은 " + t1.channel + " 입니다.");      // 7
        System.out.println("t2 의 channel 값은 " + t2.channel + " 입니다.");      // 7
    }
}


class Tv3 {
    // Tv의 속성 (멤버 변수)
    boolean power;			// 전원 상태 (on/off)
    int channel;			// 채널
    String color;			// 색상

    // Tv의 기능 (메서드)
    void power() {			// TV를 켜거나 끄는 기능을 하는 메서드
        power = !power;
    }

    void channelUp() {		// TV의 채널을 높이는 기능을 하는 메서드
        ++channel;
    }

    void channelDown() {	// TV의 채널을 낮추는 기능을 하는 메서드
        --channel;
    }
}