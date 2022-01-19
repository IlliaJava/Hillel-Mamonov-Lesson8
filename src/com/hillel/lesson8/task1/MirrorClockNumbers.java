package com.hillel.lesson8.task1;
// Task 1. Count mirror number in clocks
        /*1) Электронные часы показывают время в формате от 00:00 до 23:59.
        Подсчитать сколько раз за сутки случается так, что слева от двоеточия показывается симметричная комбинация для той,
        что справа от двоеточия (например, 02:20, 11:11 или 15:51).*/

import java.text.DecimalFormat;

public class MirrorClockNumbers {
    public static void main(String[] args) {
        int result = 0;
        for (int hours = 0; hours <= 23; hours++) {
            for (int minutes = 0; minutes <= 59; minutes++) {

                if (clockIsMirror(hours, minutes)) {
                    result++;
                    System.out.println(new DecimalFormat("00").format(hours) + " : "
                            + new DecimalFormat("00").format(minutes));
                }
            }
        }

        System.out.println("В сутках " + result + " случаев симметричных цифр на часах, вы можете увидеть их выше.");
    }

    private static boolean clockIsMirror(int hours, int minutes) {
        String hoursString = new DecimalFormat("00").format(hours).toString();
        String minutesString = new DecimalFormat("00").format(minutes).toString();

        return new StringBuilder(hoursString).reverse().toString().equals(minutesString);
    }
}
