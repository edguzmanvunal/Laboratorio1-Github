import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class EdadCalculadora {

    public static void calcularEdad(int yearOfBirth, int monthOfBirth, int dayOfBirth) {
        // Fecha de nacimiento
        LocalDate birthDate = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        // Fecha actual
        LocalDate currentDate = LocalDate.now();

        // Calcula la diferencia de edad
        Period age = Period.between(birthDate, currentDate);
        long totalDays = ChronoUnit.DAYS.between(birthDate, currentDate);
        long totalHours = totalDays * 24;

        // Imprime los resultados
        System.out.println("Años: " + age.getYears());
        System.out.println("Meses: " + age.getMonths());
        System.out.println("Días: " + age.getDays() + " (Total días: " + totalDays + ")");
        System.out.println("Total horas de vida: " + totalHours);
    }
}
