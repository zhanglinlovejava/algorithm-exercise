package com.example.myapplication;

/**
 * Created by zhanglin on 10/21/21.
 */
public class Digts {
    public static void main(String[] args) {
        int[] digts = {1, 2, 3, 4};
        int last = digts[digts.length - 1];
        if (last < 9) {
            digts[digts.length - 1]++;
            return;
        }
        for (int i = digts.length - 1; i >= 0; i--) {
            checkItemAbove(digts, i);
        }



    }

    public static int[] checkItemAbove(int[] digts, int index) {

        if (digts[index] == 9) {
            digts[index] = 0;
            digts[index - 1] += 1;
        }

        return digts;
    }
}
