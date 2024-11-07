import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int i = scan.nextInt();

        int res = i % 4 == 0 && i % 100 != 0 || i % 400 == 0 ? 1 : 0;
        System.out.println(res);
    }
}
