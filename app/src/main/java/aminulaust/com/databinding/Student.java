package aminulaust.com.databinding;

/**
 * Created by Raju on 5/7/17.
 */

public class Student {
    private String FirstName;
    private String LastName;

    public Student(String firstName, String lastName) {
        this.FirstName = firstName;
        this.LastName = lastName;
    }

    public Student() {
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }
}
