import java.util.HashSet;
import java.util.Objects;

public class HashSetEx3_2 {

    public static void main(String[] args) {
        HashSet set = new HashSet();

        set.add("abc");
        set.add("abc");

        // 현재 Person222 클래스에서 equals() 랑 hashCode() 를 오버라이딩 했기 때문에
        // 아래의 두 개가 중복 저장되지 않음 (정상)
        set.add(new Person222("David", 10));
        set.add(new Person222("David", 10));

        System.out.println(set);
    }
}


// 현재 이 Person222 클래스에서는 equals() 랑 hashCode() 를 오버라이딩 했기 때문에,
// 위의 main() 에서     set.add(new Person("David", 10));   가 HashSet 에 중복 저장되지 않음. (정상)
class Person222 {
    String name;
    int age;

    public Person222(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " : " + age;
    }

    
    // HashSet 에 중복 저장되는 것을 방지하기 위해,
    // Object 클래스로부터    equals() 와  hashCode() 를 오버라이딩 했음.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person222 person222 = (Person222) o;
        return age == person222.age && Objects.equals(name, person222.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}