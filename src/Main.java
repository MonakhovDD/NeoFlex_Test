import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите вашу среднюю зарплату за 12 месяцев:");
        double averageSalary = scanner.nextDouble();

        System.out.println("Введите количество дней отпуска:");
        int vacationDays = scanner.nextInt();

        double vacationPay = calculateVacationPay(averageSalary, vacationDays);

        System.out.println("Сумма отпускных: " + vacationPay);

        scanner.close();
    }
    public static double calculateVacationPay(double averageSalary, int vacationDays) {
        // Предположим, что отпускные равны 1/365 от годовой зарплаты за каждый день отпуска
        return averageSalary / 365 * vacationDays;
    }
}