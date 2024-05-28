public class CaptionTvTest {
    public static void main(String[] args) {

        CaptionTv ctv = new CaptionTv();

        ctv.channel = 10;					// 조상으로부터 상속받은 멤버
        ctv.channelUp();					// 조상으로부터 상속받은 멤버
        System.out.println(ctv.channel);

        ctv.displayCaption("Hello, World!");

        ctv.caption = true;					// 캡션(자막) 킨다.
        ctv.displayCaption("Hello, dude!");
    }
}


class Tv {
    boolean power;			                // 전원 상태 (on / off)
    int channel;			                // 채널

    void power() {
        power = !power;
    }

    void channelUp() {
        channel++;
    }

    void channelDown() {
        channel--;
    }
}


class CaptionTv extends Tv {
    boolean caption;                    // 캡션 상태 (on / off)

    void displayCaption(String text) {
        if(caption) {
            System.out.println(text);	// 캡션 상태가 on (즉, true) 일 때만, text 를 보여줌.
        }
    }
}