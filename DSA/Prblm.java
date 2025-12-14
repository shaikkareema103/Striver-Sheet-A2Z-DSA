import java.util.*;
public class Prblm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int k = sc.nextInt();
        int temp=0;
        for(int i=0;i<k;i++){
            if(arr[i]>arr[i+1]){
                temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
            System.out.println("After k swaps:" + Arrays.toString(arr));
        }
    }
}