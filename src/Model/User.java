package Model;

public class User {
    private int userId;
    private String userName;
    private String userAge;
    private String userWeight;
    private String userHeight;
    private String fitnessGoal;

    public User(int userId,String userName, String userAge, String userWeight, String userHeight, String fitnessGoal) {
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

    public String getUserAge() {
        return userAge;
    }

    public String getUserWeight() {
        return userWjeight;
    }

    public String getUserHeight() {
        return userHeight;
    }

    public String getFitnessGoal() {
        return fitnessGoal;
    }
}
