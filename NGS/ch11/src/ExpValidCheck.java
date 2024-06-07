import java.util.Stack;

public class ExpValidCheck {

    public static void main(String[] args) {
        Stack st = new Stack();

        String expression  = "((3 + 5) * 8 - 2)";

        System.out.println("expression = " + expression);

        try {
            for(int i = 0; i < expression.length(); i++) {
                // 1. 입력한 expression 문자열에서 한 글자씩 꺼냄
                char ch = expression.charAt(i);

                // 2-1. 여는 괄호면 stack 에다 넣음
                if(ch == '(') {
                    st.push(ch);
                // 2-2. 닫는 괄호면 stack 에서 꺼냄
                } else if (ch == ')') {
                    st.pop();
                }
            }

            // 3-1. stack 이 비어있다면, 여는 괄호와 닫는 괄호 수가 일치한다는 의미
            if(st.isEmpty()) {
                System.out.println("괄호 수가 일치합니다.");
            // 3-2. stack 이 비어있지 않다면, 여는 괄호가 남았다는 의미
            } else {
                System.out.println("괄호 수가 일치하지 않습니다. (여는 괄호가 많습니다)");
            }
        // 3-3. 닫는 괄호가 더 많으면, 예외 발생
        } catch (Exception e) {
            System.out.println("괄호 수가 일치하지 않습니다. (닫는 괄호가 많습니다)");
        }   // try
    }
}