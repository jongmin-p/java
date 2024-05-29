public class InterfaceTest {
    public static void main(String[] args) {
        A a = new A();
        a.methodA(new B());
    }
}


class A {
    public void methodA(I i) {
        i.methodB();
    }
}


class B implements I {
    public void methodB() {
        System.out.println("methodB() 입니다.");
    }
}

interface I {
    public abstract void methodB();
}