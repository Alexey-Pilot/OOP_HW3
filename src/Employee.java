import java.time.LocalDate;

/**
 * Работник
 */
public abstract class Employee implements Comparable<Employee> {

    /**
     * Имя
     */
    protected String name;

    /**
     * Фамилия
     */
    protected String surName;
    protected LocalDate birthDate;

    /**
     * Ставка заработной платы
     */
    protected double salary;

    /**
     * Расчет среднемесячной заработной платы
     * @return
     */
    public abstract double calculateSalary();


    public Employee(String name, String surName, double salary, LocalDate birthDate) {
        this.name = name;
        this.surName = surName;
        this.salary = salary;
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return String.format("%s %s %d", surName, name, birthDate.getDayOfYear());
    }

    @Override
    public int compareTo(Employee o) {
        int surNameRes = surName.compareTo(o.surName);
        if (surNameRes == 0){
            return name.compareTo(o.name);
        }
        return surNameRes;
    }


}
