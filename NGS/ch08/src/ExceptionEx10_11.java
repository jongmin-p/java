public class ExceptionEx10_11 {
    public static void main(String[] args) {
        // throw new Exception();		// Exception 은 checked 예외이다.
        // 그래서, 예외 처리 없으면 컴파일 에러 발생함. (빨간줄으로 뜲)

        throw new RuntimeException();	// 반면, RuntimeException 은 unchecked 예외이다.
        // 그래서, 예외 처리가 없더라도 컴파일 에러는 발생하지 않음. (빨간줄 안 뜲)
        // 대신, 실행 시 런타임 에러 발생해서 비정상 종료됨.
    }
}