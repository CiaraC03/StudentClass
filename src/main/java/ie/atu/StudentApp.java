package ie.atu;
import java.util.Scanner;

public class StudentApp extends Student{
    public static void main(String[] args) {
        Scanner myName = new Scanner(System.in);
        System.out.println("Enter a student name: ");
        String name = myName.nextLine();
        System.out.println("Student name is : " + name);

        


    }



}
