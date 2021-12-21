package exercise5;

public class Work5 {

    public static void main(String[] args) {

        Employee mainPerson = new Employee("Oleg", "Khudyakov", "Vladimirovich", "junior", "olegkhudyakov@gmail.com", "8 (996) 100 10 10", "25000,", "1996");

        Employee[] office = {
                mainPerson,

                new Employee("Ivan", "Ivanovich", "Ivanov", "senior", "ivanivanov01@gmail.com", "8 (917) 200 20 20", "130000", "1985");

        new Employee("Sergey", "Sergeev", "Sergeevich", "middle", "sergeysergeevich1@gmail.com", "8 (917) 200 20 20", "60000", "1987");

        new Employee("Dmitriy", "Plaskov", "Dmitrievich", "junior", "dmitriypaskov@gmail.com", "8 (927) 300 30 30", "25000", "1991");

        new Employee("larisa", "Kuznetsova", "Evgenievna", "senior", "Kuznetsovalarisa@gmail.com", "8 (996) 400 40 40", "100000", "1979");

        new Employee("lydia", "Romanova", "Evgenievna", "middle", "ivanivanov01@gmail.com", "8 (917) 500 50 50", "50000", "1985");
            };


        getEmployeeInOffice(office);
        System.out.println();
        getOldEmployee(office, 40);
    }



    private static void getOldEmployee(Employee[] office, int year) {
        for (int i = 0; i < office.length; i++)
            if(office[i].getAge() > year) {
                System.out.println(office[i].getInfo());
            }
    }

    private static void getEmployeeInOffice(Employee[] office) {
        System.out.println("All Person: ");
        for (int i =0; i < office.length; i++)
            System.out.println((i + 1) + " " + office[i].getInfo());
    }
}
