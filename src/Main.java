public class Main {
    public static void main(String[] args) {
        //Задание 1
        System.out.println("Задание 1");
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        //Задание 2
        System.out.println("Задание 2");
        int clientDeviceYear = 2012;
        if (clientDeviceYear >= 2015 && clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientDeviceYear >= 2015 && clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        if (clientDeviceYear < 2015 && clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (clientDeviceYear < 2015 && clientOS == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        //Задание 3
        System.out.println("Задание 3");
        int year = 1992;
        if (year % 4 == 0) {

            if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
                System.out.println(year + "- високосный год!");
            } else {
                System.out.println(year + "- не является високосным годом!");
            }
        }
        //Задание 4
        System.out.println("Задание 4");
        int deliveryDistance = 300;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: 1 день срок доставки");
        } else if (deliveryDistance<=60) {
            System.out.println("Потребуется дней: 2 день срок доставки");
        }else{
            System.out.println("Потребуется дней:" + (deliveryDistance/40+1) + " день срок доставки");
        }
        //Задание 5
        System.out.println("Задание 5");
        int numberMonth = 8;
        switch (numberMonth) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца нет");
        }
    }
}