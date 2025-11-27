import java.util.Scanner;

public class Main {
  public static void main(String args[]) {
    Scanner avg_input = new Scanner(System.in);
    System.out.print("Write you average number: ");    
    int avg = avg_input.nextInt();
    String grade;
    
    if (avg >= 90) {
        grade = "A" ;   
    }else if (avg >= 80) {
        grade = "B";
    }else if (avg >= 70) {
        grade = "C";
    }else if (avg >= 60) {
        grade = "D";
    }else {
        grade = "F";
    }
    System.out.println(avg + " = " + grade);
  }
}
