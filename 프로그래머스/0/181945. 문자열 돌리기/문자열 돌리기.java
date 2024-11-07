import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String[] res = str.split("");

        for(String s : res){
            System.out.println(s);
        }
            
    }
}