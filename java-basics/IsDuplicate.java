import java.util.*;
public class IsDuplicate {
    public static void main(String[] srila) {
        Scanner sr = new Scanner(System.in);
        boolean isDuplicate=false;
        System.err.print("Enter size of array :");
        int size=sr.nextInt();
        int[] arr=new int[size];
        for (int i = 0; i < size; i++) {
            arr[i]=sr.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            for(int j=i+1;j<arr.length-i;j++){
                if(arr[i]==arr[j]){
                    isDuplicate=true;
                }
            }       
        }
        if(isDuplicate){
            System.err.println("Given array have Duplicate elements");
        }
        else{
            System.err.println("Given array not have Dupicate elements");
        }
    }
}
