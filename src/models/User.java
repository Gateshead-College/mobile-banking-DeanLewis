package models;

public class User {

    private String forename;
    private String surname;
    private String DOB;
    private int creditScore;

    public User(String forename, String surname, String DOB, int creditScore) {
        this.forename = forename;
        this.surname = surname;
        this.DOB = DOB;
        this.creditScore = creditScore;
    }

    public String getForename() {
        return forename;
    }
}
