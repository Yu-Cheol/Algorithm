import java.util.*;

public class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        Add a = new Add();
        
        int i = sc.nextInt();
        int j = sc.nextInt();
        int res = a.add(i, j);
        
        System.out.println(res);
    }
}

class Add{
    int add(int i, int j){
        int res = i + j;
        return res;
    }
}