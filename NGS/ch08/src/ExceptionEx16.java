import java.io.File;

public class ExceptionEx16 {
    public static void main(String[] args) {
        try {
            File f = createFile(args[0]);
            System.out.println(f.getName() + " 파일이 성공적으로 생성되었습니다.");
        } catch (Exception e) {
            System.out.println(e.getMessage() + " 다시 입력해주시기 바랍니다.");
        }
    }	// main() 끝


    static File createFile(String fileName) throws Exception {
        // 파일명이 없거나, 빈 칸일 경우
        if (fileName == null || fileName.equals("")) {
            throw new Exception("파일 이름이 유효하지 않습니다.");	// 해당 에러를 main() 으로 던짐.
        }

        File f = new File(fileName);		// File 클래스의 객체 생성
        f.createNewFile();					// File 객체의 createNewFile() 메서드를 이용해서 실제 파일을 생성

        return f;		// 생성된 객체의 참조(즉, 주소?)  를 반환함
    }
}