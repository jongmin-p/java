import java.util.HashMap;
import java.util.Scanner;

public class HashMapEx1 {

    public static void main(String[] args) {
        HashMap map = new HashMap();

        map.put("myId", "1234");
        map.put("asdf", "1111");
        map.put("asdf", "1234");                // 에러 발생이 아니라, 키가 asdf 이던 기존의 값이 1111 에서 1234 로 덮어 씌여짐.

        Scanner s = new Scanner(System.in);     // 화면으로부터 라인 단위로 입력 받음.

        while(true) {
            System.out.println("ID 와  PWD 를 입력해 주세요.");
            System.out.print("ID : ");
            String id = s.nextLine().trim();    // 공백 제거 .trim()

            System.out.print("PWD : ");
            String pwd = s.nextLine().trim();
            System.out.println();

            // 만약 map 에 입력한 id 가 없다면,
            if(!map.containsKey(id)) {
                System.out.println("입력하신 ID 는 존재하지 않습니다. 다시 입력해 주세요.");
                continue;
            }

            // map 에 입력한 id 가 있긴 하지만,  해당 id 의 값인 value 와 입력한 pwd 가 매칭되지 않다면
            if(!map.get(id).equals(pwd)) {
                System.out.println("PWD 가 일치하지 않습니다. 다시 입력해 주세요.");

            // 입력한 id 와 pwd 가 모두 정상일 때
            } else {
                System.out.println("ID 와 PWD 가 일치합니다.");
                break;
            }
        }   // while
    }   // main
}