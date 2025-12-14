import java.util.*;
public class SubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int count=0;
        System.out.println("Enter value to sum in array to give subarray:");
        int k=sc.nextInt();
        for(int i=0;i<n-1;i++){
            if((arr[i]+arr[i+1])==k || arr[i+1]==k){
                count++;
                System.out.println("In the given array " + Arrays.toString(arr) +  " there are subarrays that sum up to " + k +  " Hence, the output is " + count );
            }
        }
        System.out.println("In the given array " + Arrays.toString(arr) +  " there are subarrays that sum up to " + k +  " Hence, the output is " + count );
    }
}
