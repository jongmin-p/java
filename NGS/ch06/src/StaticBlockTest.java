public class StaticBlockTest {
    public static void main(String[] args) {
        for(int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] : " + arr[i]);
        }
    }

    // 명시적 초기화 (간단 초기화)
    static int[] arr = new int[10];

    static {
        // 복잡 초기화 - static 블록
        for(int i = 0; i < arr.length; i++) {
            // 1 ~ 10 사이의 임의의 값을 배열 arr 에다가 저장
            arr[i] = (int)(Math.random() * 10) + 1;
        }
    }
}