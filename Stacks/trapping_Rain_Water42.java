import java.util.*;

public class trapping_Rain_Water42 {
    public int trap(int[] height) {
        Stack<Integer> st = new Stack<>();
        int water = 0;
        int n = height.length;

        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && height[i] > height[st.peek()]) {
                int top = st.pop();

                if (st.isEmpty()) break;

                int dis = i - st.peek() - 1;
                int h = Math.min(height[i], height[st.peek()]) - height[top];

                water += dis * h;
            }
            st.push(i);
        }

        return water;
    }
}
 
