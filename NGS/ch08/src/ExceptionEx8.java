public class ExceptionEx8 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);

        try {
            System.out.println(3);
            System.out.println();

            System.out.println(0 / 0);		// 0 으로 나눠서 고의로 예외 발생시킴.
            System.out.println(4);			// 실행 안 됨.
        } catch (ArithmeticException ae) {
            ae.printStackTrace();
            System.out.println("↑↑↑  ae.printStackTrace()\n");

            System.out.println("예외 메시지(ae.getMessage)  =>  " + ae.getMessage());
            System.out.println();
        }	// try-catch 끝

        System.out.println(6);
    }
}