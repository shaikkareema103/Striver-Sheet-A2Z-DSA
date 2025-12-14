import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int temp=0;
        int low=0;
        int high=n-1;
        int mid = (low+high)/2;
        for(int i=0;i<=mid;i++){
            if(arr[i]>arr[i+1]){
                temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
        for(int i=mid+1;i<high;i++){
            if(arr[i]>arr[i+1]){
                temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }

        }
        System.out.println("Sorted Array: "+Arrays.toString(arr));
        for(int i=0;i<=n-1;i++){
            if(arr[i]>arr[i-1]){
                System.out.println("Not Sorted Array");
                return;

            }
            else{
                System.out.println("Sorted Array");
                return; 
            }


        }
    }
}