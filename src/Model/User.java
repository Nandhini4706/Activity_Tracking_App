package Model;

public class User {
    private int userId;
    private String userName;
    private int userAge;
    private int userWeight;
    private double userHeight;
    private String fitnessGoal;

    public User(int userId,String userName, int userAge, int userWeight, double userHeight, String fitnessGoal) {
        this.userId = userId;
        this.userName=userName;
        this.userAge=userAge;
        this.userWeight=userWeight;
        this.userHeight=userHeight;
        this.fitnessGoal=fitnessGoal;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public int getUserAge() {
        return userAge;
    }

    public int getUserWeight() {
        return userWeight;
    }

    public double getUserHeight() {
        return userHeight;
    }

    public String getFitnessGoal() {
        return fitnessGoal;
    }
}
