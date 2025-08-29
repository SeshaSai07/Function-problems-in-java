import java.util.Scanner;
public class question11 
{
    public static void main(String[] args) 
    {

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter no of subjects: ");
    int count = sc.nextInt();

    float totalMarks = getMarks(count,  sc);
    System.out.println("Total Marks: " + totalMarks);

    float percentage = calculatePercentage(totalMarks, count);
    System.out.println("Percentage: " + percentage);

    String grade = getGrade(percentage);
    System.out.println("Grade: " + grade);

    sc.close();

    }

     static String getGrade(float percentage) {
        switch ((int) percentage / 10) {
            case 9:
                return "A+";
            case 8:
            case 7:
                return "A";
            case 6:
                return "B";
            case 5:
                return "C";
            default:
                return "D";
        }
    }

    static float calculatePercentage(float totalMarks, int count) {
        // Each subject is of 100 marks
        return (totalMarks / (count * 100)) * 100;
    }
    
     // Function to input marks and return total
    static float getMarks(int count, Scanner scanner) {
        float totalMarks = 0;
        System.out.println("Enter Marks of " + count + " subjects:");
        for (int i = 0; i < count; i++) {
            totalMarks += scanner.nextInt();
        }
        return totalMarks;
    }
}
