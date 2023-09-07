import java.time.LocalDate;
import java.time.Period;
import java.util.Comparator;

public class AgeComparator implements Comparator<Employee> {
    public int compare(Employee e0, Employee e1){
        LocalDate now = LocalDate.now();
        return Integer.compare(calculateAge(e0.birthDate, now), calculateAge(e1.birthDate, now));
    }
    private int calculateAge(LocalDate birthDate, LocalDate currentDate){
        return  (int) (currentDate.toEpochDay() - birthDate.toEpochDay());
    }
}
