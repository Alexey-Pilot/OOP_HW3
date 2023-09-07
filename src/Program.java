import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Program {

    private static Random random = new Random();

    private static LocalDate generateBirthDate(LocalDate start, LocalDate end) {
        long startED = start.toEpochDay();
        long endED = end.toEpochDay();
        long randomDay = ThreadLocalRandom.current().nextLong(startED, endED);
        return LocalDate.ofEpochDay(randomDay);
    }


    public static Employee generateEmployee() {

        String[] names = new String[]{"Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман"};
        String[] surNames = new String[]{"Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов"};
        LocalDate[] birthDates = new LocalDate[10];
        for (int i = 0; i < birthDates.length; i++) {
            birthDates[i] = generateBirthDate(LocalDate.of(1970, 1, 1), LocalDate.of(2005, 12, 31));
        }
        int typeOfEmployee = random.nextInt(0, 2);
        if (typeOfEmployee == 0) {
            return new Worker(names[random.nextInt(names.length)], surNames[random.nextInt(surNames.length)], 100 * random.nextInt(200, 500), birthDates[random.nextInt(birthDates.length)]);
        }
        return new Freelancer(names[random.nextInt(names.length)], surNames[random.nextInt(surNames.length)], 20 * 6 * random.nextInt(150, 800), birthDates[random.nextInt(birthDates.length)]);
    }

    public static Employee[] generateEmployees(int count) {
        Employee[] employees = new Employee[count];
        for (int i = 0; i < count; i++) {
            employees[i] = generateEmployee();
        }
        return employees;
    }

    public static void main(String[] args) {

        Employee[] employees = generateEmployees(12);

        for (Employee employee : employees) {
            System.out.println(employee);
        }

        Comparator<Employee> ageComparator = new AgeComparator();
        Arrays.sort(employees, ageComparator);
        System.out.println();

        for (Employee employee : employees) {
            System.out.println(employee);
        }

    }

}
