package models;

public class User {

    private String forename;
    private String surname;
    private String DOB;
    private int creditScore;
    private String username;
    private String password;

    public User(String forename, String surname, String DOB, int creditScore, String username, String password) {
        this.forename = forename;
        this.surname = surname;
        this.DOB = DOB;
        this.creditScore = creditScore;
        this.username = username;
        this.password = password;
    }

    public String getForename() {
        return forename;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
