import java.util.*;
public class Break_Question {
    public static void main(String[] args) {
        //Keep entering a number until the use enter  multiple of 10
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Enter the no:");
            int n = sc.nextInt();
            if(n%10==0){
                break;
            }
            System.out.println(n);
        }while(true);//for loop to be run for infinte times
    }
}
