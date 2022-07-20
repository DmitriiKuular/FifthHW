package ru.netology.sqr;

public class SQRService {

    public int calcSqr(int x, int y) {
        int counter = 0;
//        for (int i = x; i <= y; i++) {
//            double q = Math.sqrt(i);
//            if (q % 1 == 0) {
//                counter++;
//            }

//        for (int i = x; i <= y; i++) {
//            for (int n = 1; n <= 1_000_000; n++) {
//                if (n * n == i) {
//                    counter++;
//                }
//            }
//        }
//        return counter;

        for (int i = 10; i <= 90; i++) {
            if (i * i < x) {
                continue;
            } else {
                if (i * i <= y) {
                    counter++;
                }
            }
        }
        return counter;
    }
}

