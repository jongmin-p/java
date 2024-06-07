import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx {

    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");

        Iterator it = list.iterator();

        while(it.hasNext()) {
            Object obj = it.next();
            System.out.println("obj -> " + obj);
        }

        
        // iterator 는 일회용이라 다 쓰고 나면 다시 얻어 와야 함.
            // 새로운 iterator 객체 얻기
        it = list.iterator();

        while(it.hasNext()) {
            Object obj = it.next();
            System.out.println("[두번째 반복] obj -> " + obj);
        }
    }
}