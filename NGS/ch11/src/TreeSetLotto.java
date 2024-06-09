import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetLotto {

    public static void main(String[] args) {
        // Set set = new TreeSet();     // TreeSet 은 따로 정렬 필요 없음.   (범위 검색, 정렬 에 유리함)
        Set set = new HashSet();        // HashSet 은 정렬 필요. (List 로 먼저 옮긴 후, Collections.sort())

        for(int i = 0; set.size() < 6; i++) {
            int num = (int)(Math.random() * 45) + 1;
            set.add(num);           // set.add(new Integer(num));
        }

        System.out.println("set => " + set);
    }
}