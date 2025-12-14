import java.util.*;
public class Appeared {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<=n-1;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int Appeared=0;
        for(int i=0;i<=n-1;i++){
            if(arr[i]==arr[i+1]){
            
            }
            else{
                Appeared++;
                System.out.println( arr[i] +"element that appeared once :" + Appeared); 
            }
        }
    }
}
