class Value {
    int val;

    Value(int val) {
        this.val = val;
    }
}


public class EqualsEx1 {

    public static void main(String[] args) {
        Value v1 = new Value(10);
        Value v2 = new Value(10);

        // ┌> this    ┌> obj
        if(v1.equals(v2)) {
            System.out.println("v1 과 v2 는 같습니다.");
        } else {
            System.out.println("v1 과 v2 는 다릅니다.");
        }

        v2 = v1;                // 같은 주소값 가짐.

        if(v1.equals(v2)) {
            System.out.println("v1 과 v2 는 같습니다.");
        } else {
            System.out.println("v1 과 v2 는 다릅니다.");
        }
    }   // main
}