import java.util.*;
public class Union {
    public static void main(String[] args) {
       Integer[] A = {1, 2, 3, 4};
        Integer[] B = {3, 4, 5, 6};
        Set<Integer> union = new HashSet<>();
        union.addAll(Arrays.asList(A));
        union.addAll(Arrays.asList(B));
        System.out.println(union); 
    }
}
