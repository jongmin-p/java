public class MyMathTest {
    public static void main(String[] args) {
        MyMath mm = new MyMath();

        long result1 = mm.add(5L, 3L);
        long result2 = mm.subtract(5L, 3L);
        long result3 = mm.multiply(5L, 3L);
        double result4 = mm.divide(5L, 3L);		// double 대신 long 값으로 호출했다. (이 값은 double 로 자동 형변환된다.)

        System.out.println("add(5L, 3L) = " + result1);
        System.out.println("subtract(5L, 3L) = " + result2);
        System.out.println("multiply(5L, 3L) = " + result3);
        System.out.println("divide(5L, 3L) = " + result4);
    }
}


class MyMath {
    long add(long a, long b) {
        long result = a + b;
        return result;

        // return a + b;		// 위의 두 줄을 이렇게 한 줄로도 가능
    }

    long subtract(long a, long b) {
        return a - b;
    }

    long multiply(long a, long b) {
        return a * b;
    }

    double divide(double a, double b) {
        return a / b;
    }
}