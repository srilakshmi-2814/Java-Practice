import java.util.*;
public class SecondLargest{
    public static void main(String[] srila) {
        Scanner sr=new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int size=sr.nextInt();
        int[] arr=new int[size];
        System.err.println("Enter elements of array : ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sr.nextInt();
        }
        int large=arr[0];
        int second=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>large){
                second=large;
                large=arr[i];
            }
            else if((arr[i]<large)&&(arr[i]>second)){
                second= arr[i];
            }
        }
        System.err.println("Second Largest is : "+second);
    }
}
