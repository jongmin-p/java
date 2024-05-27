class Data3 {
    int x;
}


public class ReferenceReturnEx {
    public static void main(String[] args) {
        Data3 d = new Data3();
        d.x = 10;

        Data3 d2 = copy(d);     // copy 메서드의 반환타입이 Data3 이므로,
        // 호출 결과를 저장하는 변수의 타입 역시 Data3 타입의 참조변수여야 함.

        System.out.println("d.x = " + d.x);
        System.out.println("d2.x = " + d2.x);
    }


    static Data3 copy(Data3 d) {
        Data3 tmp = new Data3();        // 새로운 객체 tmp 를 생성한다.
        tmp.x = d.x;                    // d.x 의 값을 tmp.x 에다가 복사한다.

        return tmp;                     // 복사한 '객체의 주소' 를 반환한다.
    }
}