import java.util.*;
class Sample{
public static void main(String[] args) {
    
    int[] arr={1,2,3,4};
    check(arr);
    System.out.println(Arrays.toString(arr));
}
public static void check(int[]arr){
    arr[1]=5;
}
}