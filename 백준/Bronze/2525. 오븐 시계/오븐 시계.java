import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int i = scan.nextInt();
        int j = scan.nextInt();

        int k = scan.nextInt();

        int res = 60 * i + j;
        res += k;

        int h = (res/60) % 24;
        int m = res % 60;

        System.out.println(h + " " + m);
    }
}
