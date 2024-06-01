public class ExceptionEx9 {
    public static void main(String[] args) {
        try {
            Exception e = new Exception("고의로 예외 발생 시킴 - Exception 객체 생성");
            throw e;

            // 위의 두 줄을 아래의 한 줄처럼 줄일 수 있다.
            // throw new Exception("고의로 예외 발생 시킴 - Exception 객체 생성");
        } catch (Exception e) {
            System.out.println("에러 메시지 (e.getMessage())  =>  " + e.getMessage());
            System.out.println();

            e.printStackTrace();
            System.out.println();
        }

        System.out.println("프로그램이 정상적으로 종료되었음.");
    }
}