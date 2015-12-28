package com.simplestringbuffer;

public class PerformanceTest {

    static long startTime, stopTime;
    static String string;
    static String s1 = "String One";
    static String s2 = "String Two";
    static String s3 = "String Three";
    static String s = "";

    public static void main(String[] args) {
        startTime = System.nanoTime();
        StringConcatenation();
        stopTime = System.nanoTime();
        System.out.println(s);
        System.out.println(stopTime - startTime + "\n" + (stopTime - startTime) / 1000000000.0);

        SimpleStringBuffer simpleStringBuffer = new SimpleStringBuffer("");
        startTime = System.nanoTime();
        for(long i = 0; i < 2000; i++) {
            simpleStringBuffer.append(s1);
            simpleStringBuffer.append(s2);
            simpleStringBuffer.append(s3);
        }
        string = simpleStringBuffer.toString();
        stopTime = System.nanoTime();
        System.out.println(string);
        System.out.println(stopTime - startTime + "\n" + (stopTime - startTime) / 1000000000.0);
    }

    private static void StringConcatenation() {
        for(long i = 0; i < 2000; i++) {
            //s = s + s1 + s2 + s3;
            s = s.concat(s1).concat(s2).concat(s3);
        }
    }

}
