import java.util.*;
public class Continue_Question {
    public static void main(String[] args) {
        //Display all number entered by user except multipple of 10
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Enter the no: ");
            int n= sc.nextInt();
            if(n%10==0){
                continue;
            }
            System.out.println(n);
        }while(true);
    }
}
