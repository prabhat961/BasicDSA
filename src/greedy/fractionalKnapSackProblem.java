package greedy;

import java.util.Arrays;

class Item implements Comparable<Item> {
    int wt;
    int val;
    Item(int w, int v) {
        wt = w;
        val = v;
    }
    public int compareTo(Item i) {
        return wt * i.val - val * i.wt;
    }
}

public class fractionalKnapSackProblem {
    static double fracKnapSack(Item arr[], int n, int W) {
        Arrays.sort(arr);
        double  res = 0.0;
        for(int i = 0; i < n; i++) {
            if(arr[i].wt <= W) {
                res += arr[i].val;

                W = W - arr[i].wt;
            }
            else {
                res += arr[i].val * ((double) W / arr[i].wt);
                break;
            }
        }
        return res;
    }
}
