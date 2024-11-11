import java.util.*;

public class Main {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int i = scan.nextInt();

        for(int j = 1; j <= i; j++){
            int n1 = scan.nextInt(), n2 = scan.nextInt();
            System.out.println("Case #"+j+": "+ n1 +" + "+n2+" = "+(n1+n2));
        }
    }
}