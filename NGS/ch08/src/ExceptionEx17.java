public class ExceptionEx17 {
    // 예외 되던지기 예제.	(method1(), main()  양 쪽에서 예외를 분담하여 처리함)

    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) {
            System.out.println("main() 메서드에서 예외가 처리되었습니다.");		// 3. 두 번째 예외 처리
        }
    }


    // method1() 에서 처리하고 남은 예외를 던져주기 위해 throws 키워드 이용
    static void method1() throws Exception {
        try {
            throw new Exception();		// 최초 예외 발생
        } catch (Exception e) {
            System.out.println("method1() 메서드에서 예외가 처리되었습니다.");	// 1. 첫 번째 예외 처리
            throw e;													    // 2. 다시 예외 발생 (예외 던짐)
        }
    }
}