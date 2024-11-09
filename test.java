import org.w3c.dom.ls.LSOutput;

public class test {
    public static void main(String[] args) {

        Student firstStudent = new Student("Jan", "Testowy");
        System.out.println(firstStudent.getName());
        System.out.println(firstStudent.getSurname());
        System.out.println(firstStudent.getFullName());
    }
}
    class Student {
        private String name;
        private String surname;

        public Student(String name, String surname) {
            this.name = name;
            this.surname = surname;
        }

        public String getName() {
            return name;
        }

        public String getSurname() {
            return surname;
        }

        public String getFullName() {
            return name + " " + surname;
        }
    }



