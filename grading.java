import java.util.*;

public class grading {
    // class FullName {
    //     String FirstName;
    //     String LastName;
    // }

    private ArrayList<String> student = new ArrayList<>();
    private char[] studentgrades = { 'A', 'B', 'C', 'D', 'F' };
    private double[][] studenttestscores;
    
    public String getname(int i) {
        
        return student.get(i);
    }

    public void setname(String a1,String a2) {
        student.add(a1+" "+a2);
    }

    public double calculateAverageTestgrade(double[] studenttestscore) {
        double totalgrade = 0;
        for (int i = 0; i < studenttestscore.length; i++) {
            totalgrade += studenttestscore[i];
        }

        double average = totalgrade / studenttestscore.length;
        return average;
    }

    public char LetterGrade(double studentnumgrade) {
        char studentlettergrade = ' ';
        if (studentnumgrade < 60) {
            studentlettergrade = 'F';
        } else if (studentnumgrade < 70) {
            studentlettergrade = 'D';
        } else if (studentnumgrade < 80) {
            studentlettergrade = 'C';
        } else if (studentnumgrade < 90) {
            studentlettergrade = 'B';
        } else if (studentnumgrade < 100) {
            studentlettergrade = 'A';
        }
        return studentlettergrade;
    }

    public grading(int numberofstudents, int numberoftests) {
        studenttestscores = new double[numberofstudents][numberoftests];
    }

    public void setStudentScore(int studentIndex, int testindex, double studentscore) {
        studenttestscores[studentIndex][testindex] = studentscore;
    }

    public double[][] getstuarr() {
        return studenttestscores;
    }

    grading() {

    }
}
