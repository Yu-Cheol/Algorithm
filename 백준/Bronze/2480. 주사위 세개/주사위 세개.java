import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int i = scan.nextInt();
        int j = scan.nextInt();
        int k = scan.nextInt();

        if(i == j && j == k) {
            System.out.println(10000 + i * 1000);
        } else if (i == j) {
            System.out.println(1000 + i * 100);
        } else if (j == k) {
            System.out.println(1000 + j * 100);
        } else if (i == k) {
            System.out.println(1000 + i * 100);
        } else if(j < i && k < i) {
            System.out.println(i * 100);
        } else if (i < j && k < j) {
            System.out.println(j * 100);
        } else if (i < k && j < k) {
            System.out.println(k * 100);
        }
    }
}
