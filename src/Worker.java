import java.time.LocalDate;

/**
 * Обычный рабочий (фулл-тайм)
 */
public class Worker extends Employee{
    public Worker(String name, String surName, double salary, LocalDate birthdate) {
        super(name, surName, salary, birthdate);
    }

    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s; Рабочий; Среднемесячная заработная плата (фиксированная) %.2f",
                surName, name, birthDate.toString(), salary);
    }
}
