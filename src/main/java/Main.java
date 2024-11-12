import ru.netology.services.CalculateMonthsRest;

public class Main {

    public static void main(String[] args) {
        CalculateMonthsRest service = new CalculateMonthsRest();

        int income = 10_000;
        int expenses = 3000;
        int threshold = 20_000;
        int month = service.calculate(income, expenses, threshold);
        System.out.println(month);
    }

}
