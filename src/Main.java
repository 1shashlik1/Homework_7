public class Main {
    public static void main(String[] args) {
        //Задача№1
        System.out.println("Задача№1: Ответ.");
        int savings = 0;
        int month = 0;
        while (savings < 2_459_000) {
            month++;
            savings = savings + 15000;
            System.out.println(month + " месяц, сумма накоплений равна " + savings + " рублей.");
        }
        System.out.println();
        //Задача№2
        System.out.println("Задача№2: Ответ.");
        int number = 0;
        while (number < 10) {
            number++;
            System.out.print(number + " ");
        }
        System.out.println();
        for (; number >= 1; number--) {
            System.out.print(number + " ");
        }
        System.out.println();
        System.out.println();
        //Задача№3
        System.out.println("Задача№3: Ответ.");
        double population = 12_000_000;
        double fertility = 17;
        double mortality = 8;
        int time = 0;
        while ( time < 10 ) {
            time++;
            double annualGrowth =(fertility - mortality) / 1000;
            double increaseInNumbers = population * annualGrowth;
            double total = population + increaseInNumbers * time;
            System.out.println(time + " год, численность населения составляет " + (int)total);
        }
        System.out.println();
        //Задача№4
        System.out.println("Задача№4: Ответ.");
        double wulad = 15000;
        double percent = 0.07;
        int monthi = 0;
        while (wulad < 12_000_000) {
            wulad = wulad + wulad * percent;
            monthi++;
            System.out.println(monthi + " месяц. Накоплено " + (int)wulad + " рублей.");
        }
        System.out.println();
        //Задача№5
        System.out.println("Задача№5: Ответ.");
        double wuladi = 15000;
        int monthg = 0;
        while (wuladi < 12_000_000) {
            wuladi = wuladi + wuladi * percent;
            monthg++;
            if (monthg % 6 == 0) {
                System.out.println(monthg + " месяц. Накоплено " + (int)wuladi + " рублей.");
            }
        }
        System.out.println();
        //Задача№6
        System.out.println("Задача№6: Ответ.");
        double wuladk = 15000;
        int monthd = 0;
        while (monthd <= 108) {
            wuladk = wuladk + wuladk * percent;
            monthd++;
            if (monthd % 6 == 0) {
                System.out.println("прошло пол года. Накоплено " + (int) wuladk + " рублей.");
            }
        }
        System.out.println();
        //Задача№7
        System.out.println("Задача№7: Ответ.");
        int day = 3;
        while (day < 31) {
            day++;
            if (day % 5 == 0) {
                System.out.println("Сегодня пятница, " + day + " число. Необходимо подготовить отчет.");
            }
        }
        System.out.println();
        //Задача№8
        System.out.println("Задача№8: Ответ.");
        int cometPeriod = 79;
        int currentYear = 2023;
        int startYear = currentYear - 200;
        int endYear = currentYear + 100;
        for (int year = startYear; year <= endYear; year++) {
            if ((year - startYear) % cometPeriod == 0) {
                System.out.println(year);
            }
        }

    }
}