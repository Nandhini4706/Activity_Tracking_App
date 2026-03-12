package Tracking;

import Model.Activity;

import java.util.ArrayList;

public class Activity_Track {
     ArrayList<Activity> activities;

     public Activity_Track(){
         activities=new ArrayList<>();
     }
    public ArrayList<Activity> getActivities() {
        return activities;
    }

    public void addActivity(Activity activity){
         activities.add(activity);
     }
    public void viewActivities(){
         for(Activity a: activities){
             a.displayActivity();
             System.out.println("----------------------------------------------");
         }
    }
}
