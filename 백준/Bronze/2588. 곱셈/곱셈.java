import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int i = scan.nextInt();
        int j = scan.nextInt();

        System.out.println(i*(j%10));
        System.out.println(i*(j/10%10));
        System.out.println(i*(j/100));
        System.out.println(i*j);
    }
}
