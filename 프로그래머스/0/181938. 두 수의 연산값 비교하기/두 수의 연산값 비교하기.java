class Solution {
    public int solution(int a, int b) {
        
        int ab = Integer.parseInt(""+a+b);
        int ba = 2 * a * b;
        
        return ab == ba ? ab : Math.max(ab, ba);
    }
}