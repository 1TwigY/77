package App;

public class Main {
    public static void main(String[] args) {
    Person FirstPerson = new Person("Maciej","Galazka",22);
    Person SecondPerson = new Person("Zbigniew","Marchewa", 17);
//    FirstPerson.setAddress()

        Employee firstEmployee = new Employee(FirstPerson, Department.SALES);
    }
}






