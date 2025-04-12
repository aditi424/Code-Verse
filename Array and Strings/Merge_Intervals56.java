import java.util.*;

public class Merge_Intervals56 {
    public int[][] merge(int[][] intervals) {
        if (intervals == null || intervals.length == 0) {
            return new int[0][0];
        }  
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        
        int[][] res = new int[intervals.length][2];
        int in = 0;
        
        for (int[] i : intervals) {
            if (in == 0 || res[in - 1][1] < i[0]) {
                res[in++] = i;
            } else {
                res[in - 1][1] = Math.max(res[in - 1][1], i[1]);
            }
        }
        return Arrays.copyOf(res, in);
    }
}
