class Solution {
    public int solution(int[] num_list) {
        int num = 0;
        int num1 = 1;
        
        for(int list : num_list){
            num += list;
            num1 *= list;
        }
        
        return num * num > num1 ? 1 : 0;
    }
}