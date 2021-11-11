package ru.netology.sqr;

public class sqrService {
    public int sqrt(int min, int max) {
        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= min) {
                if (i * i <= max) {
                    counter = counter + 1;
                }

            }
        }
        System.out.println(counter);
        return counter;
    }
}
