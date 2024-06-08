import java.util.HashSet;

public class HashSetEx3_1 {

    public static void main(String[] args) {
        HashSet set = new HashSet();

        set.add("abc");
        set.add("abc");

        // 현재 Person 클래스에서 equals() 랑 hashCode() 를 오버라이딩 하지 않았기 때문에,
        // 아래의 두 개가 동일함에도 불구하고, HashSet 에 중복 저장됨 (에러)
        set.add(new Person("David", 10));
        set.add(new Person("David", 10));

        System.out.println(set);
    }
}


// 현재 이 Person 클래스에서는 equals() 랑 hashCode() 를 오버라이딩 하지 않았기 때문에,
// 위의 main() 에서     set.add(new Person("David", 10));   가 HashSet 에 중복 저장됨. (에러)
class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " : " + age;
    }
}