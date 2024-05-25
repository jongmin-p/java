public class ArrayEx5 {
    public static void main(String[] args) {
        // 총점 및 평균 구하기

        int sum = 0;		// 총점을 저장하기 위한 변수
        float avg = 0.0f;	// 평균 점수를 저장하기 위한 변수

        int[] score = { 100, 88, 100, 100, 90 };

        // 반복문을 이용하여 배열에 저장돼 있는 값들을 모두 더함.
        for(int i = 0; i < score.length; i++) {
            sum += score[i];
        }

        // 계산 결과를 float 으로 얻기 위해서 형변환
        avg = sum / (float) score.length;

        System.out.println("총점 : " + sum);
        System.out.print("평균 : " + avg);
    }
}