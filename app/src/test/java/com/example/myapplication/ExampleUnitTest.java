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

    int[] originalDigts = {9, 9, 9, 9};

    public void main() {
        int[] digits = originalDigts.clone();


        int length = digits.length;
        int last = digits[length - 1];
        ++digits[length - 1];
        if (last >= 9) {
            digits = checkItemAbove(digits, length);
        }
        printArray(originalDigts, "原生");
        printArray(digits, "最终结果");

    }

    public static int[] checkItemAbove(int[] digts, int length) {

        for (int i = length - 1; i >= 0; i--) {
            if (digts[i] > 9) {
                digts[i] = 0;
                if (i == 0) {// 最高位需要 进一位
                    int[] newArr = new int[length + 1];
                    newArr[0] = 1;
                    System.arraycopy(digts, 0, newArr, 1, length);
                    digts = newArr;
                } else {
                    ++digts[i - 1];
                }
            } else {
                break;
            }
        }
        return digts;
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