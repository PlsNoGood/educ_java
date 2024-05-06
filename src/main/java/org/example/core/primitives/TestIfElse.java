package org.example.core.primitives;


public class TestIfElse {
    public static void main(String[] args) {
        //Напиши метод, который будет принимать целое число и выводить на экран, является ли это число четным или нечетным.
        int number = 4; // Замените на любое число для проверки
        if (number % 2 == 0) {
            System.out.println("Число: " + number + "четное");
        } else {
            System.out.println("Число: " + number + "не четное");
        }

        // Напиши программу, которая принимает два числа и выводит на экран сообщение о том, какое число больше, или что они равны.
        int a = 5;
        int b = 5;
        if (a > b) {
            System.out.println("Число " + a + "больше");
        } else if (a == b) {
            System.out.println("Числа равны");
        } else {
            System.out.println("Число " + b + " больше");
        }


        // Имеется магазин, который предоставляет скидку 10% на заказы стоимостью более 1000 рублей.
        // Напишите программу, которая будет принимать стоимость заказа и выводить стоимость с учетом скидки, если она применима.
        double priceMax = 1200;

        if (priceMax > 1000) {
            System.out.println("Цена заказа: " + (priceMax * 0.9));
        } else {
            System.out.println("Цена заказа: " + priceMax);
        }


        // Напишите программу, которая будет определять
        // возрастную категорию по введенному возрасту: дети (0-12), подростки (13-19), взрослые (20-65), пенсионеры (66 и старше).
        int age = 100;
        // твой код здесь
        if (age > 0 && age <= 12) {
            System.out.println("Дети");
        } else if (age > 12 && age <= 19) {
            System.out.println("Подростки");
        } else if (age > 19 && age <= 65) {
            System.out.println("Взрослые");
        } else if (age > 65) {
            System.out.println("Пенсионеры");
        }
    }
}

