import java.util.*;
public class DleftRotate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<=n-1;i++){
            arr[i]=sc.nextInt();
        }      
        System.out.println(Arrays.toString(arr));
        int d = sc.nextInt();
        int temp=0;
        
        for(int i=0;i<=n-1;i+=d){
            
            temp=arr[0];
            arr[i]=arr[i+1];
             arr[n-1]=temp;

        }
        System.out.println(Arrays.toString(arr));
    }   
}
