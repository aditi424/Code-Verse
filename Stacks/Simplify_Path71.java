import java.util.*;

class Simplify_Path71 {
    public String simplifyPath(String path) {
        Stack<String> st = new Stack<>();
        
        String[] parts = path.split("/");

        for (String i : parts) {
            if (i.equals("") || i.equals(".")) {
                continue; 
            } else if (i.equals("..")) {
                if (!st.isEmpty()) {
                    st.pop(); 
                }
            } else {
                st.push(i); 
            }
        }

        StringBuilder sb = new StringBuilder();
        for (String i : st) {
            sb.append("/").append(i);
        }

        if(sb.length() > 0){
            return sb.toString();
        }else{
            return "/";
        }
    }
}
