import java.util.*;
import java.util.*;
public class Reverse_The_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no to get the reversed number : ");
        int n=sc.nextInt();
        int rev=0;
        while(n>0){
            int lastdigit=n%10;
            rev=rev*10+lastdigit;
            n=n/10;
        }
        System.out.println("Reversed number is : " +rev);
    }
}
