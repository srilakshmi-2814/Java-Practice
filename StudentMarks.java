import java.util.*;
public class StudentMarks {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.err.print("Enter Number of students : ");
        int students=sc.nextInt();
        int marks[]=new int[students];
        for (int i = 0; i < marks.length; i++) {
            System.err.print("Enter marks of Student "+(i+1)+" : ");
            marks[i]=sc.nextInt();
        }
        int high=marks[0];
        int low=marks[0];
        int sum=0;
        for(int j=0;j<marks.length;j++){
            if(marks[j]>high){
                high=marks[j];
            }
            if(marks[j]<low){
                low=marks[j];
            }
            sum+=marks[j];
        }
        System.err.println("Average : "+(sum/students));
        System.out.println("Highest marks : "+high);
        System.err.println("Lowest marks : "+low);
    }
}