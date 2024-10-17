import java.util.*;
public class Break_Statement {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            if(i==3){
                break;
            }
            System.out.println("Hello World");
        }
        System.out.println("I am out of the loop");
    }
}
