import java.util.Scanner;

public class GradeBook extends grading {

   public static void main(String[] args) {
      Scanner inp = new Scanner(System.in);
      double studentScore;
      double gradeaverage;
      double arrayofstu[][];
      char lettergrade;
      System.out.println("Enter number of students in the batch and number of tests assigned to them");
      int numbstudents = inp.nextInt();
      int numbtests = inp.nextInt();
      grading batch2021 = new grading(numbstudents, numbtests);
      String FirstName;
      String LastName;
      arrayofstu = batch2021.getstuarr();
      for (int currstu = 0; currstu < numbstudents; currstu++) {

         inp.nextLine();
         System.out.println("Enter FirstName of Student " + (currstu + 1));
         FirstName = inp.nextLine();
         System.out.println("Enter LastName of Student " + (currstu + 1));
         LastName = inp.nextLine();
         
         batch2021.setname(FirstName,LastName);
         for (int currtest = 0; currtest < numbtests; currtest++) {
            System.out.println("Enter Score of " + batch2021.getname(currstu) + "'s test-" + (currtest + 1));
            studentScore = inp.nextDouble();
            batch2021.setStudentScore(currstu, currtest, studentScore);
         }
      }
      for (int currstu = 0; currstu < numbstudents; currstu++) {
         gradeaverage = batch2021.calculateAverageTestgrade(arrayofstu[currstu]);
         lettergrade = batch2021.LetterGrade(gradeaverage);
         
         System.out.println(batch2021.getname(currstu) + " has grade average " + gradeaverage + " and his letter grade is " + lettergrade);

      }

   }

}
