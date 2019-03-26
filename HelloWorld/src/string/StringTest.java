package string;


import com.sun.source.tree.BinaryTree;

import javax.xml.crypto.Data;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringTest {

    //冒泡排序

    public void bubbleSort(int array[]) {
        int t = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    t = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = t;
                }
            }
        }
    }

    //选择排序
    public void test(int array[]) {
        int len = array.length;
        for (int i = 0; i < len - 1; i++) {
            int k = i;
            for (int j = i + 1; j < len - i - 1; j++) {
                if (array[j] < array[i]) {
                    k = j;
                }
                if (i != k) {
                    int t = array[j];
                    array[j] = array[i];
                    array[i] = t;
                }
            }
        }
    }


    //求一个字符串的反转字符串
    public String reverseStringTest(String s) {
        if (s == "" || s.length() <= 1) {
            return s;
        } else {
            int length = s.length();
            char[] c = s.toCharArray();
            for (int i = 0; i < length; i++) {
                c[i] = s.charAt(length - 1 - i);
            }
            return new String(c);
        }
    }


    //计算字符串中某个字符出现的次数
    public int charCountInString(String s, int index) {
        if (s == null) {
            return 0;
        } else {
            String c = s.valueOf(s.charAt(index));
            String newStr = s.replaceAll(c, "");
            int count = s.length() - newStr.length();
            System.out.println("第" + index + "位置上的字符出现次数为" + count);
            return count;
        }
    }


    public static boolean isIpLegal(String ipStr) {
        //ip地址范围：(1~255).(0~255).(0~255).(0~255)
        String ipRegEx =
                "^([1-9]|([1-9][0-9])|(1[0-9][0-9])|(2[0-4][0-9])|(25[0-5]))(\\.([0-9]|([1-9][0-9])|" + "(1" + "[0-9" + "][0-9])|(2[0-4][0-9])|(25[0-5]))){3}$";
        //String ipRegEx = "^([1-9]|([1-9]\\d)|(1\\d{2})|(2[0-4]\\d)|(25[0-5]))(\\.(\\d|([1-9]\\d)|(1\\d{2})|
        // (2[0-4]\\d)|(25[0-5]))){3}$";
        //String ipRegEx = "^(([1-9]\\d?)|(1\\d{2})|(2[0-4]\\d)|(25[0-5]))(\\.(0|([1-9]\\d?)|(1\\d{2})|(2[0-4]\\d)|
        // (25[0-5]))){3}$";
        Pattern pattern = Pattern.compile(ipRegEx);
        Matcher matcher = pattern.matcher(ipStr);
        if (matcher.matches()) {
            return true;
        } else {
            return false;
        }
    }


    //反转字符串测试
    public String test1(String s) {
        int length = s.length();
        if (s == null || length == 0) {
            return s;
        }
        char[] c = s.toCharArray();
        for (int i = 0; i < length; i++) {
            c[i] = s.charAt(length - 1 - i);
        }
        return new String(c);
    }


    //斐波那契数列
    public void feibonaqi(int x) {
        int a = 0;
        int b = 1;
        for (int i = 0; i < x; i++) {
            System.out.println(b);
            int m = b;
            int n = a + b;
            a = m;
            b = n;
        }
    }


    public static void main(String[] args) {
        int[] score = {1, 2, 3, 4, 5};
        for (int i : score) {
            System.out.println(i);
        }
        //直接打印score是直接打印score数组在内存中的地址，想打印出整个数组可以用数组的toString方法，即Arrays.toString(array);
        System.out.println(Arrays.toString(score));
        System.out.println(score[2]);

        //新建一个数组的时候要么指定数组的长度，要么直接写出数组，只能二选其一
        int num[] = new int[4];
        int num2[] = new int[]{1, 2, 3};

        StringTest stringTest = new StringTest();
        int num3[] = {7, 6, 5, 4, 3, 3, 2};
        int num4[] = {2, 3, 5, 4, 6};
        stringTest.bubbleSort(num3);
        //stringTest.bubbleSortTest(num3);
        System.out.println(Arrays.toString(num3));
        System.out.println(num3[num3.length - 1]);
        System.out.println(Arrays.toString(num4));
        String s1 = stringTest.reverseStringTest("数组转成字符串，直接return new String(char[])");
        System.out.println("s1的值是：" + s1);
        stringTest.charCountInString("fgfgfgfg", 0);
        System.out.println("反转字符串：" + stringTest.test1("  "));
        stringTest.feibonaqi(6);
        stringTest.test(num3);
        System.out.println(Arrays.toString(num3));
    }
}
