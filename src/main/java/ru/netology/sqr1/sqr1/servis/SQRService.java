package ru.netology.sqr1.sqr1.servis;

public class SQRService {
    public int numOfSquares(int min, int max) {
        int num = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= min && i * i <= max) {
                num = num + 1;
            }

        }
        return num;
    }

}