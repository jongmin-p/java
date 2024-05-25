public class ArrayEx19 {
    public static void main(String[] args) {

        int[][] score = {
                { 100, 100, 100 },
                { 20, 20, 20 },
                { 30, 30, 30 },
                { 40, 40, 40 },
                { 50, 50, 50 }
        };

        // 과목별 총점
        int korTotal = 0;
        int engTotal = 0;
        int mathTotal = 0;

        System.out.println("번호  국어  영어  수학  총점  평균 ");
        System.out.println("==============================");

        for (int i = 0; i < score.length; i++) {
            int sum = 0; // 개인별 총점
            float avg = 0.0f; // 개인별 평균

            korTotal += score[i][0];
            engTotal += score[i][1];
            mathTotal += score[i][2];

            System.out.printf("%3d", i + 1);

            // for문을 이용해서 개인별 합계(sum) 를 구한다.
            for (int j = 0; j < score[i].length; j++) {
                sum += score[i][j];
                System.out.printf("%5d", score[i][j]);
            }

            // 개인별 sum(합계) 을 과목 수(score[i].length) 로 나눠서 평균 점수를 구한다.
            avg = sum / (float) score[i].length; // 평균 계산
            System.out.printf("%5d %5.1f\n", sum, avg);
        }


        System.out.println("==============================");
        System.out.printf("총점 : %3d %4d %4d\n", korTotal, engTotal, mathTotal);
    }
}