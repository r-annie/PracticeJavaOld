import java.util.Scanner;

public class Main {
    private static int minIncome = 200000;
    private static int maxIncome = 900000;

    private static int officeRentCharge = 140000;
    private static int telephonyCharge = 12000;
    private static int internetAccessCharge = 7200;

    private static int assistantSalary = 45000;
    private static int financeManagerSalary = 90000;

    private static double mainTaxPercent = 0.24;
    private static double managerPercent = 0.15;

    private static double minInvestmentsAmount = 100000;

    public static void main(String[] args) {
        while (true) {
            //расчёт и вывод минимальной суммы дохода для инвестирования
            double minIncomeForInvestments = (minInvestmentsAmount+calculateFixedCharges()*
                    (1-mainTaxPercent))/((1-mainTaxPercent)*(1-managerPercent));
            System.out.println("Минимальная сумма доходов компании в месяц " +
                            "для возможности инвестирования " + minIncomeForInvestments + " рублей.");
            System.out.println("Введите сумму доходов компании за месяц " +
                "(от 200 до 900 тысяч рублей): ");
            //ввод суммы доходов компании за месяц
            int income = (new Scanner(System.in)).nextInt();

            if (!checkIncomeRange(income)) {
                continue;
            }

            //расчет зарплаты менеджера в месяц = сумма доходов * процент(часть)менеджера
            double managerSalary = income * managerPercent;
            //расчет чистой прибыли в месяц: сумма доходов - зарплата менеджера - всё, что описано в
            //calculateFixedCharges()
            double pureIncome = income - managerSalary -
                calculateFixedCharges();
            //расчет налогов на прибыль в месяц: налоговая ставка * чистую прибыль
            double taxAmount = mainTaxPercent * pureIncome;
            //расчет чистой прибыли в месяц за вычетом налогов: чистая прибыль в
            // месяц - налоги на прибыль в месяц
            double pureIncomeAfterTax = pureIncome - taxAmount;

            //булева переменная - возможность инвестировать: истина, если чистая прибыль после
            //вычета налогов превышает минимальную сумму для инвестирования
            boolean canMakeInvestments = pureIncomeAfterTax >=
                minInvestmentsAmount;

            System.out.println("Зарплата менеджера: " + managerSalary);
            System.out.println("Общая сумма налогов: " +
                (taxAmount > 0 ? taxAmount : 0));
            System.out.println("Компания может инвестировать: " +
                (canMakeInvestments ? "да" : "нет"));
            if (pureIncome < 0) {
                System.out.println("Бюджет в минусе! Нужно срочно зарабатывать!");
            }
        }
    }

    private static boolean checkIncomeRange(int income) {
        if (income < minIncome) {
            System.out.println("Доход меньше нижней границы");
            return false;
        }
        if (income > maxIncome) {
            System.out.println("Доход выше верхней границы");
            return false;
        }
        return true;
    }

    private static int calculateFixedCharges() {
        //стоимость аренды
        return officeRentCharge +
                // стоимость услуг телефонии
            telephonyCharge +
                // стоимость услуг доступа к интернету
            internetAccessCharge +
                // зарплата ассистента -
            assistantSalary +
                // зарплата менеджера по финансам
            financeManagerSalary;
    }
}
