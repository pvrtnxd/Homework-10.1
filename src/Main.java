import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");
        printLP(2022);
        printLP(2021);


        System.out.println("Задание 2");
        Info(1,2022);
        Info(0,2020);


        System.out.println("Задание 3");
        delivery(10);
        delivery(100);
        delivery(30);
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

    private static void Info(int OS, int year) {
        String OsName = defileOsName(OS);
        String OsVer = App(year);

        System.out.println("Для ОС " + OsName + " установите " + OsVer + " версию.");
    }

    private static String defileOsName(int OS) {
        if (OS == 0) {
            return "IOS";
        } else if (OS == 1) {
            return "Android";
        } else {
            return "Unknown ";
        }
    }

    private static String App(int year) {
        int currentYear = LocalDate.now().getYear();

        if (currentYear != year) {
            return "облегченную";
        } else {
            return "обычную";
        }

    }

    private static int calcDelDays (int dist) {
        int delDays = 0;
        if (dist <= 20) {
            delDays =1;
        } else if (dist <=60) {
            delDays = 2;
        } else if (dist <=100) {
            delDays = 3;
        } else { delDays = 0; }

        return  delDays;
    }

    private  static void delivery (int dist) {
        System.out.println("Потребуется дней для доставки: " + calcDelDays(dist));
    }


}
