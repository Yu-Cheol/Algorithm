class Solution {
    public String solution(String str1, String str2) {
        StringBuilder res = new StringBuilder();
        String res2 = "";
        
        for(int i=0; i<str1.length(); i++){
            res.append(str1.charAt(i)).append(str2.charAt(i));
        }
        res2 = res.toString();
        
        return res2;
    }
}