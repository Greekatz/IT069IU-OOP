package Final.De;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();

        double fee = FeeCalculator.calculateFee(student);
        StudentStorable.save(student);
        AttendanceReportable.reportAttendance(student);
    }
}
