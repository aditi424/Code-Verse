import java.util.*;

class Valid_Parentheses20 {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<Character>();
        int n = s.length();
        
        for(char ch:  s.toCharArray()){
            if(ch == '[' || ch =='(' || ch == '{'){
                st.push(ch);
            }else{
                if(st.isEmpty())return false;
                
                if((ch == ']' && st.peek() == '[') || 
                   (ch == ')' && st.peek() == '(') || 
                   (ch == '}' && st.peek() == '{')){
                    st.pop();
                }else{
                    return false;
                }
            }
        }
        
        return st.isEmpty();
        
    }
}



