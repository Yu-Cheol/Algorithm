import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int i = scan.nextInt();

        for(int c = 0; c < i; c++){
            int j = scan.nextInt(), k = scan.nextInt();
            System.out.println(j + k);
        }
    }
}