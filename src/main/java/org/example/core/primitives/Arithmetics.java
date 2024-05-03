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
    }

    public static int plusCalculateInt(int a, int b) {
        return a+b;
    }
}
