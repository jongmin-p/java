import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx1 {

    public static void main(String[] args) {
                        // 문자열 "1",   Integer 1
        Object[] objArr = { "1", new Integer(1), "2", "2", "3", "3", "4", "4", "4" };

        Set set = new HashSet();

        for(int i = 0; i < objArr.length; i++) {
            set.add(objArr[i]);         // HashSet 에 objArr 의 요소들을 저장
        }

        System.out.println(set);        // HashSet 에 저장된 요소들을 출력


        Iterator it = set.iterator();   // HashSet 에 저장된 요소들을 출력 (Iterator 이용)

        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}