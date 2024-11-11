import java.util.*;

public class Main {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        for(;;){
            int i = scan.nextInt(), j = scan.nextInt();
            int res = i + j;
            if(res == 0)
                break;
            System.out.println(res);

        }
    }
}