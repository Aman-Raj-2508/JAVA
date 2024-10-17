import java.util.*;
public class TransposeMatrix {
   int arr[][] = {{1, 2, 3}, {4, 5, 6}};

   for(int i =0 ;i <arr.length;i++){
    for(int j=0;j<arr[0].length;j++){
        arr[i][j]=arr[j][i];
    }
   }
}