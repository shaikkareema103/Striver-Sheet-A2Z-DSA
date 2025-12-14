import java.util.*;
public class SecondLargest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<=n-1;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int first_num=0;
        int second_num=0;
        for(int i=0;i<=n;i++){
            if(arr[i]>arr[i+1]){
                first_num=arr[i];
                break;
            }
            if(arr[i]>arr[i+1]){
                second_num=arr[i];
                System.out.println("Second Largest Number :" +second_num);
            }
            else{
                second_num=arr[i+1];
                System.out.println("Second Largest Number :" +second_num);
            }
        }
        
    }
}