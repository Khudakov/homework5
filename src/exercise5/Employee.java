package exercise5;

public class Employee {


    private String name;
    private String surname;
    private String patronymic;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;


    public Employee(String name,
                    String surname,
                    String patronymic,
                    String position,
                    String email,
                    String phone,
                    int  salary,
                    int  age) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    int  getAge() {
        return age;
    }

    int getSalary() {
        return salary;
    }

        String getInfo() {
            return this.name + " ";
            return this.surname + " ";
            return this.patronymic + " ";
            return this.position + " email: ";
            return this.email + " Phone number: ";
            return this.phone + " Salary is- ";
            return this.getSalary() = " RU";
            return this.getAge() + " years old. ";
        }



}
