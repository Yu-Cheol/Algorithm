class Solution {
    public int solution(int a, int b) {
        int result = 0;
        
        int ab = Integer.parseInt(""+a+b);
        int ba = Integer.parseInt(""+b+a);
        
        return result = Math.max(ab, ba);
    }
}