public class ArrayEx6 {
    public static void main(String[] args) {
        // 최대값 / 최소값 구하기

        int[] score = { 79, 88, 91, 33, 100, 55, 95 };

        int max = score[0];
        int min = score[0];

        for(int i = 0; i < score.length; i++) {
            // 반복문을 돌면서, 해당 요소에 담긴 값이 max 보다 크다면 max 에다가 그 값을 저장
            if(score[i] > max) {
                max = score[i];

            // 반면, 해당 요소에 담긴 값이 min 보다 작다면 min 에다가 그 값을 저장함
            } else if(score[i] < min) {
                min = score[i];
            }
        }

        System.out.println("최대값 : " + max);
        System.out.println("최소값 : " + min);
    }
}