public class ArrayEx18 {
    public static void main(String[] args) {
        // 2차원 배열 출력 예제

        int[][] score = {
                { 100, 100, 100 },
                { 20, 20, 20 },
                { 30, 30, 30 },
                { 40, 40, 40 },
        };

        int sum = 0;


        // 2차원 배열의 요소들을 모두 출력하려면, 이중 반복문 사용
        for(int i = 0; i < score.length; i++) {
            for(int j = 0; j < score[i].length; j++) {
                // System.out.println("score[" + i + "][" + j + "] = " + score[i][j]);
                System.out.printf("score[%d][%d] = %d\n", i, j, score[i][j]);
                sum += score[i][j];
            }
        }

        System.out.println();
        System.out.println("sum = " + sum);
    }
}