import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        int len = num_list.length;
        
        if (num_list[len - 1] > num_list[len - 2]) {
            num_list = Arrays.copyOf(num_list, len + 1);
            num_list[len] = num_list[len - 1] - num_list[len - 2];
        } else {
            num_list = Arrays.copyOf(num_list, len + 1);
            num_list[len] = num_list[len - 1] * 2;
        }
        
        return num_list;
    }
}