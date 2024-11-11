import java.util.*;

public class Main {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int i = scan.nextInt();
        String s = "";

        for(int j = 1; j <= i; j++){
            s += "*";
            System.out.println(s);
        }
    }
}