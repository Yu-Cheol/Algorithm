class Solution {
    public int solution(int n) {
        int sub = 0;
        int sum = 0;
        
        for(int i = 0; i <= n; i++){
            if(i % 2 == 0){
                sub += i * i;
            }else{
                sum += i;
            }
        }
        return n % 2 == 0 ? sub : sum;
    }
}