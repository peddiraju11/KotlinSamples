package interoperability.challenge;

public class Employee {

    private String fName;
    private String lName;
    private float[] salaryData;

    public Employee(String firstName, String lastName) {
        this.fName = firstName;
        this.lName = lastName;
        this.salaryData = new float[3];
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public float[] getSalaryData() {
        return salaryData;
    }

    public void setSalaryData(float[] salaryData) {
        this.salaryData = salaryData;
    }
}
