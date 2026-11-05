import java.util.*;
public class Armstrong {
    public static void main(String[] args){
        Scanner sr=new Scanner(System.in);
        System.err.println("Enter a number");
        int num=sr.nextInt();
        int temp=num;
        int reverse=0;
        while(num>0){
            int digit=num%10;
            reverse=digit*digit*digit+reverse;
            num=num/10;
        }
        if(temp==reverse){
            System.err.println(temp+" is a armstrong number");
        }
        else{
            System.err.println(temp+" is not a armstrong number");
        }
    }
}
