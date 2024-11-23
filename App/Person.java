package App;

class Person {
    private String name;
    private String surname;
    private int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {

        return surname;
    }

    public void setSurname(String surname) {
        if (this.age < 18) {
            System.out.println("Osoba niepełnoletnia nie może zmienić nazwiska");
        } else {
            System.out.println("Zmieniono nazwisko " + this.surname + " na " + surname);
        }
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public String getFullName() {

        return name + " " + surname + " " + age;
    }
}
