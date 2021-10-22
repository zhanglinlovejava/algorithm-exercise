package com.example.myapplication;

/**
 * Created by zhanglin on 10/22/21.
 */
public class PlusOne {
    public static int[] checkItemAbove(int[] digts) {
        int length = digts.length;
        int index = length - 1;
        ++digts[index];
        while (index >= 0 && digts[index] > 9) {
            digts[index] = 0;
            if (index == 0) {
                int[] newArr = new int[length + 1];
                newArr[0] = 1;
                System.arraycopy(digts, 0, newArr, 1, length);
                digts = newArr;
                break;
            } else {
                ++digts[index - 1];
                index--;
            }
        }
        return digts;
    }
}
