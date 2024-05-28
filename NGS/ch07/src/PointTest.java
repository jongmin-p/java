public class PointTest {
    public static void main(String[] args) {
        Point3D p3 = new Point3D(1, 2, 3);
        System.out.println(p3.getLocation());
    }
}


class Point {
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    String getLocation() {
        return "x : " + x + ", y : " + y;
    }
}


class Point3D extends Point {
    int z;

    Point3D(int x, int y, int z) {
        // 여기다가 super(x, y); 를 넣거나, 아니면 부모 클래스인 Point 에다가 기본 생성자 넣어줘야 함.
        // 일단 여기서는 super(x, y); 를 넣자.	그럼 에러 발생 안 함.
        super(x, y);

        this.x = x;
        this.y = y;
        this.z = z;
    }

    String getLocation() {
        return "x : " + x + ", y : " + y + ", z = " + z;
    }
}