package validparentheses;

import java.util.Stack;

/**
 * Created by Asus_User on 2018/7/12.
 */
public class Solution {
    public boolean isValid(String s){
        Stack<Character> stack = new Stack<Character>();
        char[] ch=s.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            if(ch[i] == '('){
                stack.push(')');
            }else if(ch[i] == '['){
                stack.push(']');
            }else if(ch[i] == '{'){
                stack.push('}');
            }else{
                if(stack.isEmpty()||stack.pop() != ch[i]){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
