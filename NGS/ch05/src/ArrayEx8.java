public class ArrayEx8 {
    public static void main(String[] args) {
        // 로또 번호 생성

        // 45개의 정수값을 저장하기 위한 배열 생성 (범위는 0 ~ 44)
        int[] ball = new int[45];

        // 배열의 각 요소애 1 ~ 45 의 값을 저장함
        for(int i = 0; i < ball.length; i++) {
            ball[i] = i + 1;	// ball[0] 에 1 이 저장됨
        }

        int tmp = 0;	// 두 값을 바꾸는데 사용할 임시 변수
        int j = 0;		// 임의의 값을 얻어서 저장할 변수

        // 배열의 i 번째 요소와 임의의 요소에 저장된 값을 서로 바꿔서 값을 섞는다.
        // 0번째부터 5번째 요소까지 모두 6개만 바꾼다.
        for(int i = 0; i < 6; i++) {
            j = (int)(Math.random() * 45);	// 0 ~ 44 범위의 읨의의 값을 얻는다

            // 아래 코드는 ball[i] 와 ball[j] 의 값을 서로 바꾼다
            tmp = ball[i];
            ball[i] = ball[j];
            ball[j] = tmp;
        }

        // 배열 ball 의 요소들 중 앞에서부터 6개만 출력
        for(int i = 0; i < 6; i++) {
            System.out.printf("ball[%d] = %d\n", i, ball[i]);
        }
    }
}