import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        StringBuilder res = new StringBuilder();

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(Character.isUpperCase(ch)){
                res.append(Character.toLowerCase(ch));
            }else{
                res.append(Character.toUpperCase(ch));
            }
        }
        System.out.println(res);
    }
}