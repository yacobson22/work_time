import java.util.Scanner;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class WorkHoursCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите время начала работы (HH:mm): ");
        String startTimeInput = scanner.nextLine();
        LocalTime startTime = LocalTime.parse(startTimeInput);

        System.out.println("Введите время окончания работы (HH:mm): ");
        String endTimeInput = scanner.nextLine();
        LocalTime endTime = LocalTime.parse(endTimeInput);

        long hoursWorked = ChronoUnit.HOURS.between(startTime, endTime);
        System.out.println("Отработано часов: " + hoursWorked);
    }
}
