import Model.Activity;
import Model.User;
import Tracking.Activity_Track;

import java.util.*;
public class FitnessTrackerApp{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Activity_Track tracker=new Activity_Track();
        System.out.println("------------Welcome to Activity Tracker-----------");
        System.out.println("Enter EmailId ");
        String email = sc.nextLine();

        String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";

        if (email.matches(regex)) {
            System.out.println("Login Successfully✅");
        }
        System.out.println("----------------Menu-----------------");
        System.out.println("1.Add Details");
        System.out.println("2.Add Activity");
        System.out.println("3.View Activities");
        System.out.println("Exit");
        System.out.println("-------------------------------------");
        int choice=sc.nextInt();
        sc.nextLine();
        switch(choice){
            case 1:
                System.out.println("Enter name: ");
                String name=sc.nextLine();
                sc.nextLine();
                System.out.println("Enter age: ");
                int age=sc.nextInt();
                System.out.println("Enter weight: ");
                int weight=sc.nextInt();
                System.out.println("Enter height: ");
                double height=sc.nextInt();
                sc.nextLine();
                System.out.println("Enter goals: ");
                String goal=sc.nextLine();
             User user=new User(1,name,age,weight,height,goal);

             break;
            case 2:
                System.out.println("Enter activity type : ");
                String s1=sc.nextLine();
                System.out.println("Enter Duration : ");
                int s2=sc.nextInt();
                System.out.println("Enter Distance : ");
                double s3=sc.nextDouble();
                System.out.println("Enter Calories Burned : ");
                double s4=sc.nextDouble();
                System.out.println("Enter Heart Rate : ");
                int s5=sc.nextInt();
                 Activity activity=new Activity(s1,s2,s3,s4,s5);
                 tracker.addActivity(activity);
                 System.out.println("---------Activities Added SuccessFully--------");
                 break;
            case 3:
                tracker.viewActivities();
                break;
            case 4:
                System.out.println("--------Thank You For Visiting--------");
                break;
            default:
                System.out.println("Invalid Try Choice");
        }
    }
}