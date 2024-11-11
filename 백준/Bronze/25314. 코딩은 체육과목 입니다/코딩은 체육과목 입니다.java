import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int i = scan.nextInt();
        String s = "long";

        for(int j = 0; j < i; j++){
            if(j % 4 == 0)
                System.out.print(s+" ");
        }
        System.out.println("int");
    }
}
