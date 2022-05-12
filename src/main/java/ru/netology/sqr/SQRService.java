package ru.netology.sqr;

public class SQRService {

    public int calculate(int min, int max) {

        int count = 0;
        if (min < max) {
            for (int i = 10; i <= 99; i++) {
                if (i * i >= min) {
                    if (i * i <= max) {

                        count++;
                    }
                }
            }
        } else {
            System.out.println("Недопустимый диапазон");
        }
        return (count);
    }
}
