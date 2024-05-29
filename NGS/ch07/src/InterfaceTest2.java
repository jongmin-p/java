public class InterfaceTest2 {
    public static void main(String[] args) {
        A2 a2 = new A2();

        a2.autoPlay(new B2());		// void autoPlay(I2 i2) 호출
        a2.autoPlay(new C2());		// void autoPlay(I2 i2) 호출
    }
}


class A2 {
    void autoPlay(I2 i2) {
        i2.play();
    }
}


interface I2 {
    public abstract void play();
}


class B2 implements I2 {
    public void play() {
        System.out.println("play in B2 class");
    }
}


class C2 implements I2 {
    public void play() {
        System.out.println("play in C2 class");
    }
}