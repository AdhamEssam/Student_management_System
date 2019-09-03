package studentManegmentSystem;
import java.util.Scanner;

public class StudentDataBaseApp {
    public static void main(String[] args){


        //Ask how many new Students you want to add
        System.out.println("Enter how many Students you want to enroll:");
        Scanner input = new Scanner(System.in);
        int noOfStudents = input.nextInt();
        Student [] students = new Student[noOfStudents];

        //create a number of new Students
        for (int n = 0; n < noOfStudents; n++){
            students [n] = new Student();
            students [n].enroll();
            students [n].payTution();
            System.out.println("");
            System.out.println("your Info :");
            System.out.println(students [n].showInfo());

        }
        for (int n = 0; n < noOfStudents; n++){
            System.out.println(students[n].toString());
        }

    }
}
