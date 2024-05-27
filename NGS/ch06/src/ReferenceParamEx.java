class Data2 {
    int x;
}


public class ReferenceParamEx {
    public static void main(String[] args) {
        Data2 d = new Data2();
        d.x = 10;
        System.out.println("main() : x = " + d.x);

        change(d);          			// d.x 가 아닌 참조형 (즉, 주소) 을 넘김.
        System.out.println("After change(d)");
        System.out.println("main() : x = " + d.x);
    }

    static void change(Data2 d) {       // 참조형(Data2) 매개변수를 받음.
        d.x = 1000;
        System.out.println("change() : x = " + d.x);
    }
}