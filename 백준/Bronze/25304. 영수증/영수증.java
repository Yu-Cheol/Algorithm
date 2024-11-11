import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int i = scan.nextInt();
        int c = scan.nextInt();

        for(int j = 0; j < c; j++){
            int sub = scan.nextInt(), count = scan.nextInt();
            i = i - sub * count;
        }
        if(i == 0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}