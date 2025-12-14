import java.util.*;
public class SortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<=n-1;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int temp = 0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<=n-1;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("Sorted Array: " + Arrays.toString(arr));
        boolean sorted = isSorted(arr, n);
        if(sorted){
            System.out.println("true");
        } else {
            System.out.println("false.");
        }
    }
    public static boolean isSorted(int[] arr,int n){
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
            return true;
    }
}

