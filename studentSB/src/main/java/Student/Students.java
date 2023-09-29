package Student;

public class Students {
    private String name;
    private int rollNo;
    private String email;
    private String country;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Students(String name, String email, String country) {
        this.name = name;
        this.email = email;
        this.country = country;
    }

    public Students(String name, int rollNo, String email, String country) {
        this.name = name;
        this.rollNo = rollNo;
        this.email = email;
        this.country = country;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
