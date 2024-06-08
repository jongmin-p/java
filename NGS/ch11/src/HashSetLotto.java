import java.util.*;

public class HashSetLotto {

    public static void main(String[] args) {
        Set set = new HashSet();

        // set 의 크기가 6보다 작으면 1 ~ 45 사이의 난수를 저장
        for(int i = 0; set.size() < 6; i++) {
            int num = (int)(Math.random() * 45) + 1;

            // set.add(new Integer(num));
            set.add(num);
        }


        // 순서대로 정렬하려면 Collections.sort() 를 사용해야 함.
            // 하지만, Set 은 순서를 유지하지 않기 때문에 Collections.sort() 를 사용할 수 없다.
            // 그래서 Set 을 먼저 List 로 옮기고, 해당 List 를 Collections.sort() 에 담으면 됨.
        List list = new LinkedList(set);
        Collections.sort(list);

        System.out.println(list);
    }
}