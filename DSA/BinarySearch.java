import java.util.*;
public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<=n-1;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int temp=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("Sorted Array:" + Arrays.toString(arr));
        System.out.println("Enter the target element to search:");
        int target = sc.nextInt();
        for(int i=0;i<=n-1;i++){
            if(arr[i]==target){
                System.out.println("Element found at index: " + i);
                return;
            }
        }
        sc.close();
    }
}
