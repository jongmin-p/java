public class ExceptionEx4 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);

        try {
            System.out.println(3);
            System.out.println(4);
        } catch (Exception e) {
            System.out.println(5);		// 예외가 발생하지 않았기에, 이 문장은 실행 X
        }	// try-catch 끝

        System.out.println(6);
    }
}