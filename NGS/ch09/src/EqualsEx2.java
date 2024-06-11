class Person {
    long id;

    // equals() 를 오버라이딩하여 "주소가 아닌, 객체에 저장된 내용을 비교" 하도록 변경함.
    public boolean equals(Object obj) {
        // obj 는 Object 타입이므로, id 값을 참조하기 위해서는 Person 타입으로 형변환이 필요함.
        if(obj instanceof Person) {
            return id == ((Person)obj).id;

        // 타입이 Person 이 아니라면, 값을 비교할 필요도 없음.
        } else {
            return false;
        }
    }

    Person(long id) {
        this.id = id;
    }
}


public class EqualsEx2 {

    public static void main(String[] args) {
        // 서로 다른 객체지만, 값을 같게 만듦.
        Person p1 = new Person(8011081111222L);
        Person p2 = new Person(8011081111222L);

        // 주소 값은 다른 객체이기에 else 문 실행
        if(p1 == p2) {
            System.out.println("p1 과 p2 는 같은 사람입니다.");
        } else {
            System.out.println("p1 과 p2 는 다른 사람입니다.");
        }


        // 주소값은 다르지만,   객체에 저장된 값(8011081111222L) 은 똑같기에, 여기서는 if 문 실행
        if(p1.equals(p2)) {
            System.out.println("p1 과 p2 는 같은 사람입니다.");
        } else {
            System.out.println("p1 과 p2 는 다른 사람입니다.");
        }
    }
}