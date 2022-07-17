package ru.netology.sqr;

public class SQRService {

    public int calcSqr(int x, int y) {
        int counter = 0;
        for (int i = x; i <= y; i++) {
            double q = Math.sqrt(i);
            if (q % 1 == 0) {
                counter++;
            }
        }
        return counter;
    }
}
