import java.util.*;

public class Main {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int i = scan.nextInt();

        for(int j = 1; j <= i; j++){
            for(int k = 1; k <= i - j; k++){
                System.out.print(" ");
            }
            for(int n = 1; n <= j; n++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}