package Lab3.Q3;

public class Staff extends Person {
    private String school;
    private double pay;

    public Staff(String name, String school, double pay) {
        super(name);
        this.school = school;
        this.pay = pay;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    @Override
    public String toString() {
        return String.format("Staff %s , School: %s , Pay: %f",
                super.toString(), school, pay);
    }
}
