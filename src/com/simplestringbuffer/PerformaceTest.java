package com.simplestringbuffer;

/**
 * Created by Akshay on 28-12-2015.
 */
public class PerformaceTest {

    static long startTime, stopTime;
    static String string;
    static String s1 = "String One";
    static String s2 = "String Two";
    static String s3 = "String Three";
    static String s;

    public static void main(String[] args) {
        startTime = System.nanoTime();
        StringConcatenation();
        stopTime = System.nanoTime();
        System.out.println(stopTime - startTime + "\n" + (stopTime - startTime) / 1000000000.0);

        SimpleStringBuffer simpleStringBuffer = new SimpleStringBuffer(s1);
        startTime = System.nanoTime();
        simpleStringBuffer.append(s2);
        simpleStringBuffer.append(s3);
        string = simpleStringBuffer.toString();
        stopTime = System.nanoTime();
        System.out.println(string);
        System.out.println(stopTime - startTime + "\n" + (stopTime - startTime) / 1000000000.0);
    }

    private static void StringConcatenation() {
        for(int i = 0; i < 100; i++) {
            s = s1 + s2 + s3;
        }
    }

}
