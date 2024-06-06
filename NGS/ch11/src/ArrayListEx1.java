import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx1 {

    public static void main(String[] args) {
        ArrayList list1 = new ArrayList(10);

        // add() -> 변경
        // list1.add(5);                                        // 이것도 가능
        list1.add(new Integer(5));
        list1.add(new Integer(4));
        list1.add(new Integer(2));
        list1.add(new Integer(0));
        list1.add(new Integer(1));
        list1.add(new Integer(3));


        ArrayList list2 = new ArrayList(list1.subList(1, 4));   // ArrayList(Collection c)
        print(list1, list2);

        // 정렬 (Collection 인터페이스랑 Collections 클래스랑 다름)
        Collections.sort(list1);
        Collections.sort(list2);
        print(list1, list2);

        // list1 이 list2 의 모든 요소를 포함하는지?
        System.out.println("list1.containsAll(list2) = " + list1.containsAll(list2));

        list2.add("B");
        list2.add("C");
        list2.add(3, "A");                          // 인덱스가 3인 곳에다가 추가
        print(list1, list2);

        // set() -> 변경
        list2.set(3, "AA");
        print(list1, list2);

        // 인덱스 0 에다가, Integer 가 아닌, 문자열 "1" 추가
        list1.add(0, "1");                            // [1, 0, 1, 2, 3, 4, 5]

        // indexOf() 는 지정된 객체의 위치(index) 를 알려줌
        System.out.println("index = " + list1.indexOf("1"));                      // 문자열 "1"
        // System.out.println("index = " + list1.indexOf(1));                     // Integer 1
        System.out.println("index = " + list1.indexOf(new Integer(1)));     // Integer 1
        System.out.println();

        // remove() -> 삭제
        list1.remove("1");
        System.out.println("list1 = " + list1);                                   // [0, 1, 2, 3, 4, 5]

        list1.remove(new Integer(1));
        System.out.println("list1 = " + list1);                                   // [0, 2, 3, 4, 5]

        // 주의!
        // remove(1) 하면,    Integer 1 이나 String "1" 이 아닌,        Index 가 1 인 요소가 삭제됨
        list1.remove(1);
        System.out.println("list1 = " + list1);                                   // [0, 3, 4, 5]
        System.out.println();
        
        // list1 에서 list2 와 겹치는 부분만 남기고, 나머지는 삭제
        System.out.println("list1.retainAll(list2) = " + list1.retainAll(list2));
        print(list1, list2);

        // list2 에서 list1 에 포함된 객체들을 삭제     (중요, 강의 마지막 참고)
        for(int i = list2.size() - 1; i >= 0; i--) {
            // 1. get(i)     을 이용해서, list2 에서 하나씩 꺼낸다.
            // 2. contains() 을 이용해서, 꺼낸 객체가 list1 에 있는지 확인한다.
            if(list1.contains(list2.get(i))) {
                // 3. remove(i)  을 이용해서, 해당 객체를 list2 에서 삭제한다.
                list2.remove(i);
            }
        }

        print(list1, list2);
    }


    // 출력만
    private static void print(ArrayList list1, ArrayList list2) {
        System.out.println("list1 = " + list1);
        System.out.println("list2 = " + list2);
        System.out.println();
    }
}