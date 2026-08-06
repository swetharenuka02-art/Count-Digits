
import java.util.*;
public class count {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("enter n value");
        int n=s.nextInt();
        int count=0;
        while(n>0){
            int rem=n%10;
            count++;
            n=n/10;

        }
        System.out.println("The number os dogits in a number is "+count);
        s.close();
        
    }
    
}
