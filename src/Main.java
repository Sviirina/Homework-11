public class Main {

    public static void main(String[] args) {
        System.out.println("Задача 1");
        getYear(1978);
        System.out.println("Задача 2");
        chekClientDeviceYear(2015);
        checkOs(0);
        System.out.println();
        System.out.println("Задача 2 / исправлено");
        checkApplicationVersion(2010, 1);
        System.out.println();
        System.out.println("Задача 3");
        calculateDeliveryDays(62);
    }

    public static void getYear(int year) {
        if (year % 4 == 0 && year % 100 != 100 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void chekClientDeviceYear(int clientDeviceYear) {
        if (clientDeviceYear < 2015) {
            System.out.print("Установите облегченную версию приложения ");
        } else {
            System.out.print("Установите версию приложения для ");
        }
    }

    public static void checkOs(int oS) {
        if (oS == 0) {
            System.out.print("iOS по ссылке.");
        } else {
            System.out.print(" Android по ссылке");
        }
    }

    public static void checkApplicationVersion (int clientDeviceYear, int oS) {
        if (clientDeviceYear < 2015) {
            System.out.print("Установите облегченную версию приложения ");
        } else {
            System.out.print("Установите версию приложения для ");
        }
        if (oS == 0) {
            System.out.print("iOS по ссылке.");
        } else {
            System.out.print(" Android по ссылке");
        }

    }

    public static void calculateDeliveryDays(int deliveryDistance) {
        int deliveryDays = 1;
        if (deliveryDistance > 20) {
            deliveryDays++;
        }
        if (deliveryDistance > 60 && deliveryDistance <= 100) {
            deliveryDays++;
        } else {
            System.out.println("Срок доставки рассчитать невозможно");
        }
        System.out.println("Потребуется дней для доставки: " + deliveryDays);
    }
}
