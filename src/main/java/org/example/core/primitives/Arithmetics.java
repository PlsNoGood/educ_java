package org.example.core.primitives;

/**
 *  Ниже приведен пример как написать метод для сложения двух интов (plusCalculateInt)
 *  метод принимает на вход 2 параметра и возвращает их сумму. Затем вызывается метод калкулейт
 *  в методе main где передаем эти параметры.
 *  Задача - написать для интов остальные математические операции (вычитание, умножение, деление)
 *  и такие же методы для float, byte, long.
 *  Также по аналогии вызвать их в методе main с выводом на консоль. (13ая строка)
 */
public class Arithmetics {
    public static void main(String[] args) {

        System.out.println(plusCalculateInt(1,2));

        System.out.println(minusCalculateInt(1,2));

        System.out.println(multiplyCalculateInt(1,2));

        System.out.println(divideCalculateInt(1,2));


        System.out.println(plusCalculateByte((byte) 1,(byte) 2));

        System.out.println(minusCalculateByte((byte) 1,(byte) 2));

        System.out.println(multiplyCalculateByte((byte) 1,(byte) 2));

        System.out.println(divideCalculateByte((byte) 1,(byte) 2));


        System.out.println(plusCalculateFloat(1f,2f));

        System.out.println(minusCalculateFloat(1f,2f));

        System.out.println(multiplyCalculateFloat(1f,2f));

        System.out.println(divideCalculateFloat(1f,2f));


        System.out.println(plusCalculateLong(1L,2L));

        System.out.println(minusCalculateLong(1L,2L));

        System.out.println(multiplyCalculateLong(1L,2L));

        System.out.println(divideCalculateLong(1L,2L));
    }



    //Метод вычисляющий сумму int
    public static int plusCalculateInt(int a, int b) {
        return a+b;
    }
    //Метод вычисляющий разницу int
    public static int minusCalculateInt(int a, int b) {
        return a-b;
    }
    //Метод вычисляющий произведение int
    public static int multiplyCalculateInt(int a, int b) {
        return a*b;
    }
    //Метод вычисляющий частное int
    public static int divideCalculateInt(int a, int b) {
        return a/b;
    }


    //Метод вычисляющий сумму byte
    public static byte plusCalculateByte(byte a, byte b) {
        return (byte) (a + b);
    }
    //Метод вычисляющий разницу byte
    public static byte minusCalculateByte(byte a, byte b) {
        return (byte) (a - b);
    }
    //Метод вычисляющий произведение byte
    public static byte multiplyCalculateByte(byte a, byte b) {
        return (byte) (a * b);
    }
    //Метод вычисляющий частное byte
    public static byte divideCalculateByte(byte a, byte b) {
        return (byte) (a / b);
    }


    //Метод вычисляющий сумму float
    public static float plusCalculateFloat(float a, float b) {
        return a + b;
    }
    //Метод вычисляющий разницу float
    public static float minusCalculateFloat(float a, float b) {
        return a - b;
    }
    //Метод вычисляющий произведение float
    public static float multiplyCalculateFloat(float a, float b) {
        return a * b;
    }
    //Метод вычисляющий частное float
    public static float divideCalculateFloat(float a, float b) {
        return a / b;
    }


    //Метод вычисляющий сумму long
    public static long plusCalculateLong(long a, long b) {
        return a + b;
    }
    //Метод вычисляющий разницу long
    public static long minusCalculateLong(long a, long b) {
        return a - b;
    }
    //Метод вычисляющий произведение long
    public static long multiplyCalculateLong(long a, long b) {
        return a * b;
    }
    //Метод вычисляющий частное long
    public static long divideCalculateLong(long a, long b) {
        return a / b;
    }




    }

