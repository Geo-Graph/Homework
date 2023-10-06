package homework3;

import java.lang.Math;
import java.sql.SQLOutput;

public class Hometasks3 {

    public static void main(String[] args) {

        // HOMETASK 1:

        // указываю границы ранжирования
        int max = 500, min = 10, range;
        range = max - min + 1;

        /*
        использую цикл for для выполнения функции ранжирования
        указываю период попыток от 0 до 10.
        при этом необходимо узнать войдет ли полученное число в нужный период
        */
        for (int i = 0; i < 10; i++) {

            int rand = (int) (Math.random() * range) + min;

            if (25 <= rand && rand <= 200) {
                System.out.println("!!! " + rand);
            } else {
                System.out.println("Your number " + rand + " isn't in range"); }
        }

        // HOMETASK 2:

        int currentScoreValue = 98;

        if(currentScoreValue >= 90) {
            System.out.println("\n You are on the FIRST place");
        } else if(80 <= currentScoreValue && currentScoreValue <= 89) {
            System.out.println("\n You are on the SECOND place");
        } else if(70 <= currentScoreValue && currentScoreValue <= 79) {
            System.out.println("\n You are on the THIRD place");
        } else {
            System.out.println("\n See you later. YOU LOSE");
        }

        // HOMETASK 3:

        int coordinationX = 4, coordinationY = -6;

        if(coordinationX < 0 && coordinationY < 0) {
            System.out.println("\n It's the first quarter");
        } else if(coordinationX > 0 && coordinationY < 0) {
            System.out.println("\n It's the second quarter");
        } else if(coordinationX > 0 && coordinationY > 0) {
            System.out.println("\n It's the third quarter");
        } else if(coordinationX < 0 && coordinationY > 0) {
            System.out.println("\n It's the fourth quarter");
        }

        // HOMETASK 4:

        int monthNumber = 2, feb;
        // isLeap - переменная которая говорит является ли год высокосным
        boolean isLeap = false;

        switch (monthNumber) {
            case 1, 3, 5, 7, 8, 10, 12 -> System.out.println("\n There are 31 days this month");
            case 4, 6, 9, 11 -> System.out.println("\n There are 30 days this month");
            case 2 -> System.out.println("\n There is February, 28 days, sometimes 29...");
        }
        if (!isLeap) {
            System.out.println("Этот год является высокосным");
        } else {
            System.out.println("Этот год не является высокосным");
        }

        //HOMETASK 5:

        int couponNumber = 3214, resultSum = 34_522;

        switch (couponNumber) {
            case 1111 -> System.out.println("\n Your check with a 10% discount: " + resultSum * 0.9);
            case 3333 -> System.out.println("\n Your check with a 20% discount: " + resultSum * 0.8);
            case 5555 -> System.out.println("\n Your check with a 30% discount: " + resultSum * 0.7);
            default -> System.out.println("\n Your check: " + resultSum);
        }





    }
}
