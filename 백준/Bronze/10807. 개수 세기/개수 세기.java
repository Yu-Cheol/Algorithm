import java.util.*;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();
        int[] arr = new int[i];

        for(int n = 0; n < i; n++){
            arr[n] = sc.nextInt();
        }

        int j = sc.nextInt();

        int count = 0;

        for(int n = 0; n < i; n++){
            if(arr[n] == j) count++;
        }
        System.out.println(count);
    }
}