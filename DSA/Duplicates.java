import java.util.*;
public class Duplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int [n];
        for(int i=0;i<=n-1;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int dup=0;
        for(int i=0;i<=n-1;i++){
            dup=arr[i];
            for(int j=i+1;j<n-1;j++){
                if(arr[j]==dup){
                    arr[j]=0;
                }
            }
        }
        System.out.println("Duplicates removed array:" + Arrays.toString(arr));
    }
}
