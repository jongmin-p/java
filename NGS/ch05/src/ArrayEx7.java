public class ArrayEx7 {
    public static void main(String[] args) {
        // 배열 요소들의 순서 섞기

        int[] numArr = new int[10];

        for(int i = 0; i < numArr.length; i++) {
            numArr[i] = i;
            System.out.print(numArr[i]);
        }

        System.out.println();

        for(int i = 0; i < 100; i++) {
            int n = (int)(Math.random() * 10);	// 0 ~ 9 사이 중 임의의 정수 (즉, 난수)
            // 현재 numArr 의 요소들이 0 ~ 9 라서 동일하게 설정함.
            // 변수 n 을 배열의 인덱스로 사용할 거임.

            // 아래 코드는 numArr[0] 과 numArr[n] 의 값을 서로 바꾸는 과정
            int tmp = numArr[0];
            numArr[0] = numArr[n];
            numArr[n] = tmp;
        }


        for (int i = 0; i < numArr.length; i++) {
            System.out.print(numArr[i]);
        }
    }
}