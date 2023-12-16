
public class Ex5_2_tmp {
	public static void main(String[] args) {
		//		인덱스 01234
		String str = "ABCDE";
		
		char ch = str.charAt(2);						//  C
		
		String str2 = str.substring(1, 4);				// BCD
		
		String str3 = str.substring(1, str.length());	// BCDE (1~5, 하지만 5는 포함 X)
		String str4 = str.substring(1);					// BCDE (위와 결과 같음)


		System.out.println("ch : " + ch);
		System.out.println("str2 : " + str2);
		System.out.println("str3 : " + str3);
		System.out.println("str4 : " + str4);
	}
}