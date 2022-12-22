import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");
        printLP(2022);
        printLP(2020);


        System.out.println("Задание 2");
        printInfo(1,2022);
        printInfo(0,2020);


        System.out.println("Задание 3");
        printDeliveryDays(10);
        printDeliveryDays(110);
        printDeliveryDays(30);
    }

    private static boolean isLP(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    private static void printLP(int year) {
        if (isLP(year)) {
            System.out.println(year + " - високосный год");
        } else {
            System.out.println(year + " - не високосный год");
        }
    }

    private static void printInfo(int mobileOS, int year) {
        String osName = defileOsName(mobileOS);
        String osVer = defineApp(year);

        System.out.println("Для ОС " + osName + " установите " + osVer + " версию.");
    }

    private static String defileOsName(int mobileOS) {
        if (mobileOS == 0) {
            return "IOS";
        } else if (mobileOS == 1) {
            return "Android";
        } else {
            return "Unknown ";
        }
    }

    private static String defineApp(int year) {
        int currentYear = LocalDate.now().getYear();

        if (currentYear != year) {
            return "облегченную";
        } else {
            return "обычную";
        }

    }

    private static int calcDelDays (int dist) {
        int deliveryDays;

        if (dist <= 20) {
            deliveryDays = 1;
        } else if (dist <= 60) {
            deliveryDays = 2;
        } else if (dist <= 100) {
            deliveryDays = 3;
        } else  {
            deliveryDays = 0;
        }

        return deliveryDays;
    }

    private static void printDeliveryDays (int dist) {
        if (calcDelDays(dist) <=0 ) {
            System.out.println("Доставки нет");
        } else {

            System.out.println("Потребуется дней для доставки: " + calcDelDays(dist));
        }


    }




}
