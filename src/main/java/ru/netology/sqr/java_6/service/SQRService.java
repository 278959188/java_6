package ru.netology.sqr.java_6.service;

public class SQRService {
    int FirstNumber = 10;
    int SecondNumber = 99;

    public int calcSqrt(int x, int y) {
        int count = 0;
        int squareOfNumber = 0;

        for (int i = FirstNumber; i <= SecondNumber; i++) {
            squareOfNumber = i * i;
            if (squareOfNumber >= x && squareOfNumber <= y) {
                count = count + 1;
            }
        }
        return count;

    }
}