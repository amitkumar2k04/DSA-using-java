package DS07_DSA.Stacks;

import java.util.Stack;

public class infix {
    public static void main(String[] args) {
        String str = "9-(5+3)*4/6";
        Stack<Integer> val = new Stack<>();
        Stack<Character> op = new Stack<>();

        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);  // 5
            int ascii = (int)ch;   // 53
            if(ascii >= 48 && ascii<=57) val.push(ascii - 48);

            else if (op.size() == 0 || ch == '(' || op.peek() =='(')
                op.push(ch);

            else if (ch == ')') {
                while (op.peek() != '('){
                    // work
                    int v2 = val.pop();
                    int v1 = val.pop();
                    if(op.peek() == '+') val.push(v1 + v2);
                    if(op.peek() == '-') val.push(v1 - v2);
                    if(op.peek() == '*') val.push(v1 * v2);
                    if(op.peek() == '/') val.push(v1 / v2);
                    op.pop();
                }
                op.pop();   // '(' hata diya
            }

            else{
                if(ch == '+' || ch == '-'){
                    // work
                    int v2 = val.pop();
                    int v1 = val.pop();
                    if(op.peek() == '+') val.push(v1 + v2);
                    if(op.peek() == '-') val.push(v1 - v2);
                    if(op.peek() == '*') val.push(v1 * v2);
                    if(op.peek() == '/') val.push(v1 / v2);
                    op.pop();
                    // push
                    op.push(ch);
                }
                if(ch == '*' || ch == '/'){
                    if(op.peek() == '*' || op.peek() == '/'){
                        // work
                        int v2 = val.pop();
                        int v1 = val.pop();
                        if(op.peek() == '*') val.push(v1 * v2);
                        if(op.peek() == '/') val.push(v1 / v2);
                        op.pop();
                        // push
                        op.push(ch);
                    }
                    else op.push(ch);
                }
            }

        }
        while (val.size() > 1){
            // work
            int v2 = val.pop();
            int v1 = val.pop();
            if(op.peek() == '+') val.push(v1 + v2);
            if(op.peek() == '-') val.push(v1 - v2);
            if(op.peek() == '*') val.push(v1 * v2);
            if(op.peek() == '/') val.push(v1 / v2);
            op.pop();
        }
        System.out.println(val.peek());
    }
}
