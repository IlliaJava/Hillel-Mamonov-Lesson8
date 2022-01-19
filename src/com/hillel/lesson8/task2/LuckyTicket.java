package com.hillel.lesson8.task2;
// Task 2. Count lucky tickets
        /*2) Найти количество счастливых билетиков на трамвай от 000001 до 999999
        - те у которых сумма первых 3 цифр равна сумме последних 3*/

public class LuckyTicket {
    public static void main(String[] args) {
        int result = 0;
        for (int i = 000001; i <= 999999; i++) {
            int number1 = i / 100000;
            int number2 = (i / 10000) % 10;
            int number3 = (i / 1000) % 10 % 10;
            int number4 = (i / 100) % 10 % 10 % 10;
            int number5 = (i / 10) % 10 % 10 % 10 % 10;
            int number6 = i % 10 % 10 % 10 % 10;

            if (number1 + number2 + number3 == number4 + number5 + number6) {
                result++;
            }
        }
        System.out.println("В выборке билетов 000001..999999 наберется " + result + " счастливых билетиков.");
    }

}