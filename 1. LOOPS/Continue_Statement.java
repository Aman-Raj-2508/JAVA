import java.util.*;
public class Continue_Statement {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            if(i==3){// Skips the 3rd iteration
                continue;
            }
            System.out.print(i+" ");
        }
    }
}
