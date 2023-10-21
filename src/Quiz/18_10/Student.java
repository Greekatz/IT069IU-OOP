
// Nguyen Thanh Hung_ITCSIU22051
public class Student {
        private String major;
        private int ID;
        private String name;
        private static int counter = 0;


        // public Student(String name) {
        //     this.major = null;
        //     this.name = name;
        //     this.ID = generateStudentId();
        //     totalStudents++;
        // }

        private Student(String name) {
            counter++;
            this.name = name;
            if (counter > 1)
                System.out.println("Hey, stop");
        }

        
        public void setMajor(String major) {
            if (major.equals("CS") || major.equals("NE")) {
                this.major = major;
            } else {
                System.out.println("Error: Student does not satisfy the requirements");
            }
        }


        public static Student getNewStudent(String name){
            return new Student(name);
        }

        public String getMajor() {
            return major;
        }


        public int getID() {
            return ID;
        }


        public void setID(int iD) {
            ID = iD;
        }


        public String getName() {
            return name;
        }


        public void setName(String name) {
            this.name = name;
        }

    
}
