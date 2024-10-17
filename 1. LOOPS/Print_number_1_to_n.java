import java.util.*;
public class Print_number_1_to_n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number till which you want to print : ");
        int n = sc.nextInt();
        int counter=1;
        while(counter<=n){
            System.out.println(counter);
            counter++;
        }
    }
}
