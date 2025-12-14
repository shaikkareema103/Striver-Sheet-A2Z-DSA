import java.util.*;
public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int target=sc.nextInt();
        int result=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr[i]==arr[j]){
                    continue;
                }
                if(arr[i]+arr[j]==target){
                    result=arr[i]+arr[j];
                     System.out.println("The 2 sum for target index " + i + " and index " + j + " that is " + result);

                }
            }
        }
    }
}
