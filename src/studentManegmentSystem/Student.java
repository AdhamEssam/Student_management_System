package studentManegmentSystem;

import java.util.Scanner;

public class Student {
    // this is the  Instance variable's
    private String firstname;
    private String lastname;
    private String gradename = "";
    private int gradeyear;
    private String StudentId;
    private String courses= "";
    private int Balance = 0;
    private static int costOfCourse=600;
    private static int id = 1000;

    //Constructor the user to enter the name and the year
    public Student() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        this.firstname = input.nextLine();

        System.out.print("Enter your last name: ");
        this.lastname = input.nextLine();

        System.out.print("1 for freshman \n2 for a junior\n3 for a Senior\nEnter your Grade Year: ");
        this.gradeyear = input.nextInt();
        switch (gradeyear){
            case 1:
                gradename = "freshman";
                break;

            case 2:
                gradename = "junior";
                break;

            case 3:
                gradename = "Senior";
                break;
        }


        //call generate id method
        setStudentId();




    }

    //genetate Student Id
    private void setStudentId(){
        id++;
        this.StudentId = gradeyear +""+id;
    }

    //enroll in courses
    public void enroll(){
        //get inside a loop, user hits 0
        do {
            System.out.print("Enter course to enroll (Q to quit): ");
            Scanner input = new Scanner(System.in);
            String course = input.nextLine();
            if (!course.equals("Q")){
                courses = courses +"\n "+course;
                Balance = Balance + costOfCourse;
            }else {break;}
        }while (1 != 0);



    }

    //view Balance
    public void viewBalance(){
        System.out.println("your Tutition Balance is : $ "+Balance);
    }

    //pay tution
    public void payTution(){
        Scanner input = new Scanner(System.in);
        viewBalance();
        System.out.println("Enter how much you want to pay: ");
        int payment = input.nextInt();
        Balance = Balance - payment;
        System.out.println("Thank you for your payment: "+ payment);
        viewBalance();
    }

    //show status
    public String showInfo(){
        return "Name: "+firstname+" "+lastname +
                "\nCourses Enrolled: "+ courses +
                "\nTution Balance: "+Balance +
                "\nGrade year: "+gradename+
                "\nStudent Id: "+StudentId;
    }

}
