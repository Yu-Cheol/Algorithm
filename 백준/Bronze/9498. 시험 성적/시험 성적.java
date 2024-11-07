import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int i = scan.nextInt();

        String res;
        res = i >= 90 ? "A" : i >= 80 ? "B"  : i >= 70 ? "C" : i >= 60 ? "D" : "F";

        System.out.println(res);
    }
}
