import java.util.Arrays;

public class ArrayEx2 {
    public static void main(String[] args) {
        int[] iArr1 = new int[10];
        int[] iArr2 = new int[10];
        // int[] iArr3 = new int[]{ 100, 95, 80, 70, 60 };
        int[] iArr3 = { 100, 95, 80, 70, 60 };
        char[] chArr = { 'a', 'b', 'c', 'd' };

        // 1 ~ 10 의 숫자들을 순서대로 iArr1 배열에 저장
        for(int i = 0; i < iArr1.length; i++) {
            iArr1[i] = i + 1;
        }

        // 1 ~ 10 사이의 임의의 수(난수) 를 생성하여 iArr2 배열에 저장
        for(int i = 0; i < iArr2.length; i++) {
            iArr2[i] = (int)(Math.random() * 10) + 1;
        }

        // 반복문 돌면서 iArr1 배열의 요소들을 출력
        for(int i = 0; i < iArr1.length; i++) {
            System.out.print(iArr1[i] + ", ");
        }


        System.out.println();

        // Arrays 클래스의 toString 배열을 이용하여 배열의 요소들을 출력
        System.out.println(Arrays.toString(iArr2));
        System.out.println(Arrays.toString(iArr3));
        System.out.println(Arrays.toString(chArr));

        System.out.println(iArr3);	// 참조변수의 주소값 출력함
        System.out.println(chArr);	// 예외로, char[] 의 경우 주소값이 아닌 배열의 요소들을 출력함
    }
}