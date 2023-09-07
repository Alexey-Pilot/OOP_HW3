import java.time.LocalDate;

/**
 * TODO: Доработать в рамках домашнего задания
 */
public class Freelancer extends Employee{

    public Freelancer(String name, String surName, double salary, LocalDate birthDate) {
        super(name, surName, salary, birthDate);
    }

    @Override
    public double calculateSalary() {
        return salary * 8 * 20;
    }

    public String toString(){
        return String.format("%s %s %s; Фрилансер; Среднемесячная заработная плата (договорная) %.2f",
                surName, name, birthDate.toString(), salary);
    }
}
