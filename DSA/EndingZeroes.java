import java.util.*;
public class EndingZeroes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        System.out.println("Enter the number of elements:");
        int[] arr=new int[n];
        for(int i=0;i<=n-1;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int temp=0;
        for(int i=0;i<=n;i++){
            for(int j=0;j<n-1;j++){
                if(arr[j]==0){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }  
            } 
        }
        System.out.println("Array after moving zeroes to end:" +Arrays.toString(arr));

    }
}
