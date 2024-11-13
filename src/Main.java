public class Main {
    public static void main(String[] args) {

        //Задача 1
        int os = 1;
        if (os == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        //Задача 2
        os=0;
        int clientDeviceYear = 2019;
        if (os == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");}
        else if (os == 0 && clientDeviceYear> 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");}
        else if (os != 0 && clientDeviceYear<2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");}
        else {
            System.out.println("Установите версию приложения для Android по ссылке");}

        //Задача 3
        int year = 2021;
        if (year > 1584 && ((year%4 == 0 && year% 100 != 0)||(year % 400 == 0))) {
            System.out.println(year+ " год является високосным");}
        else {
            System.out.println(year+ "год не является високосным");}

        //Задача 4
        int deliveryDistance =95;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней " + 1);}
        else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней " +2);}
        else if (deliveryDistance >60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней "+3);}
        else {System.out.println("Нет доставки");}

        //Задача 5
        int monthNumber =9;
        switch (monthNumber){
        case 1:
            System.out.println("Зима");
        break;
        case 2:
            System.out.println("Зима");
        break;
        case 3:
            System.out.println("Весна");
        break;
        case 4:
            System.out.println("Весна");
        break;
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
        case 12:
            System.out.println("Зима");
        break;
        default:
            System.out.println("Всего 12 месяцев в году");}



        }


    }
