import java.util.*;
public class Palindrom{
    public static void main(String[] args){
        Scanner sr=new Scanner(System.in);
        System.err.println("Enter a name");
        String name=sr.nextLine();
        String rev="";
        for(int i=name.length()-1;i>=0;i--){
            rev+=name.charAt(i);
        }
        if(rev.equals(name)){
            System.err.println("Given name is palindrome");
        }
        else{
            System.err.println("Not a palindrome");
        }
    }
}