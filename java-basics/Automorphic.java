import java.util.*;
public class Automorphic {
    public static void main(String[] srila) {
        Scanner sr=new Scanner(System.in);
        System.err.print("Enter a number : ");
        int number=sr.nextInt();
        int temp=number;
        int diviser=1;
        int square=number*number;
        while (number>0){
            diviser=diviser*10;
            number=number/10;
        }
        if(temp==(square%diviser)){
            System.err.println(temp+" is a Automorphic number");
        }
        else{
            System.err.println(temp+" is not a Automorphic number");
        }
    }
}
