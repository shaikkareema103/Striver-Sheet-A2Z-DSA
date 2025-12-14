import java.util.*;
public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        System.out.println("Enter the number of elements:");
        int[] arr=new int[n];
        for(int i=0;i<=n-1;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int large_num=0;
        for(int i=0;i<=n;i++){
            if(arr[i]>arr[i+1]){
                large_num=arr[i];
                System.out.println("Largest Number :" +large_num);
                break;  
            }
        }
        sc.close();
    }    
}
