public class ExceptionEx5 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);

        try {
            System.out.println(3);

            System.out.println(0 / 0);		// 0 으로 나눠서 고의로 예외 발생시킴.
            System.out.println(4);			// 실행 안 됨.
        } catch (ArithmeticException ae) {
            System.out.println(5);
        }	// try-catch 끝

        System.out.println(6);
    }
}