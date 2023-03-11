import java.util.Scanner;
public class percentageCalculator 
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Marks In Hindi");
         float hindiMarks= sc.nextInt();
        System.out.println("Enter Marks In English");
        float englishMarks = sc.nextInt();
        System.out.println("Enter Marks In Physics");
        float physicsMarks = sc.nextInt();
        System.out.println("Enter Marks In Chemistry");
        float chemistryMarks = sc.nextInt();
        System.out.println("Enter Marks In Mathematics");
        float mathsMarks = sc.nextInt();
        float sum= hindiMarks+englishMarks+physicsMarks+chemistryMarks+mathsMarks;
        float percent= sum/5;
      System.out.println("Your overall percentage : "+percent+"%");
    }
}