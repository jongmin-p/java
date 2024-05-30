public class ExceptionEx7 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);

        try {
            System.out.println(3);

            System.out.println(0 / 0);			// 0 으로 나눠서 고의로 예외 발생시킴.
            System.out.println(4);				// 실행 안 됨.
        } catch (ArithmeticException ae) {
            if(ae instanceof ArithmeticException) {
                System.out.println("true");
            }

            System.out.println("ArithmeticException");
        } catch (Exception e) {					// 여기서는 위의 ArithmeticException 을 제외한, 모든 예외가 처리됨.
            System.out.println("Exception");
        }	// try-catch 끝


        System.out.println(6);
    }
}