/* leetcode 3160

 */
package HashMaps;

import java.util.HashMap;
import java.util.Map;

public class DistinctBallCols {
    public int[] queryResults(int limit, int[][] q) {
        Map<Integer,Integer> bm = new HashMap<>();
        Map<Integer,Integer> cm = new HashMap<>();
        int[] ans = new int[q.length];
        int index = 0;
        for(int i = 0 ; i < q.length ; ++i ){
            int x = q[i][0];
            int y = q[i][1];
            if(bm.containsKey(x)){
                int bmc = bm.get(x);
                int fbmc = cm.get(bmc);
                fbmc--;
                if(fbmc==0) cm.remove(bmc);
                else cm.put(bmc,fbmc);

            }
            bm.put(x,y);
            if(cm.containsKey(y)){
                int fcmc = cm.get(y);
                fcmc++;
                cm.put(y,fcmc);
            }
            else cm.put(y,1);
            ans[index++] = cm.size();
        }
        return ans;
    }

    public static void main(String[] args) {

    }
}
