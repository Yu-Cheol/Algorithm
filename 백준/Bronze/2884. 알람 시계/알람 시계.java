import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int i = scan.nextInt();
        int j = scan.nextInt();

        if(j < 45){
            i--;
            j = 60 - (45 - j);
            if(i < 0){
                i = 23;
            }
            System.out.println(i+" "+j);
        }else{
            System.out.println(i+" "+(j-45));
        }
    }
}
