class Solution {
    public int solution(int[] num_list) {
        
        int answer = 0;
        String even = "";
        String odd = "";
        
        for(int i = 0; i < num_list.length; i++){
            int j = num_list[i];
            if(j % 2 == 0){
                even += j;
            }else{
                odd += j;
            }
        }
        
        int evenSum = Integer.parseInt(even.isEmpty() ? "0" : even);
        int oddSum = Integer.parseInt(odd.isEmpty() ? "0" : odd);
        
        answer = evenSum + oddSum;
        
        return answer;
    }
}