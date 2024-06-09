import java.util.*;

public class HashMapEx2 {

    public static void main(String[] args) {
        HashMap map = new HashMap();

        map.put("김자바", new Integer(100));
        map.put("이자바", new Integer(100));
        map.put("강자바", new Integer(80));
        map.put("안자바", new Integer(90));

        Set set = map.entrySet();
        Iterator it = set.iterator();   // Collection 인터페이스(List, Set) 의 메서드

        while(it.hasNext()) {
            // Map 인터페이스 내부에 정의되어 있는 Entry 인터페이스    (즉, 내부 인터페이스)
            Map.Entry e = (Map.Entry)it.next();

            System.out.println("이름 : " + e.getKey() + ", 점수 : " + e.getValue());
                        // key 값들 가져옴   <┘                              └> value 값들 가져 옴
        }

        System.out.println();

        set = map.keySet();     // 이름(key) 만 가져옴.
        System.out.println("참가자 명단 : " + set);

        System.out.println();

        Collection values = map.values();
        it = values.iterator();

        int total = 0;

        while (it.hasNext()) {
            Integer i = (Integer)it.next();
            total += i.intValue();
        }

        System.out.println("총점 : " + total);
        System.out.println("평균 : " + (float)total / set.size());
        System.out.println("최고 점수 : " + Collections.max(values));
        System.out.println("최저 점수 : " + Collections.min(values));
    }
}