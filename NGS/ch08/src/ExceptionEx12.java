public class ExceptionEx12 {
    // 아래 3개의 메서드들 중 아무 곳에도 예외 처리가 없어서 비정상 종료됨
    // static void method2() 에서 예외를 발생시키고, static void method1() 으로 예외를 떠넘김.
    // 그리고 static void method1() 역시나 예외 처리 없이 main() 으로 떠넘겼고,  main() 에서도 예외 처리 하지 않아서 비정상 종료됨.

    public static void main(String[] args) throws Exception {
        method1();			// 같은 클래스 내의 static 멤버이므로 객체 생성 없이 직접 호출 가능함.
    }

    static void method1() throws Exception {
        method2();
    }

    static void method2() throws Exception {
        throw new Exception();
    }
}