package com.example.myapplication;

import org.junit.Test;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        main();
    }

    int[] originalDigts = {9, 1, 4, 9, 9, 9, 9, 1, 9, 9, 9};

    public void main() {
        int[] digits = originalDigts.clone();
        digits = PlusOne.checkItemAbove(digits);
        printArray(originalDigts, "原生");
        printArray(digits, "最终结果");

    }


    public static void printArray(int[] digts, String tag) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < digts.length; i++) {
            sb.append(digts[i]);
            if (i == digts.length - 1) {
                sb.append("]");
            } else {
                sb.append(",");
            }
        }
        System.out.println(tag + " " + sb.toString());

    }

}