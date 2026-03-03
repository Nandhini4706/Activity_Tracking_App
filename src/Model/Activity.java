package Model;

public class Activity {
    private String activityType;
    private int duration;
    private double distance;
    private double caloriesBurned;
    private int heartRate;

    public Activity(String activityType, int duration, double distance, double caloriesBurned, int heartRate) {
        this.activityType = activityType;
        this.duration=duration;
        this.distance=distance;
        this.caloriesBurned=caloriesBurned;
        this.heartRate=heartRate;
    }

    public String getActivityType() {
        return activityType;
    }

    public int getDuration() {
        return duration;
    }

    public double getDistance() {
        return distance;
    }

    public double getCaloriesBurned() {
        return caloriesBurned;
    }

    public int getHeartRate() {
        return heartRate;
    }
}
