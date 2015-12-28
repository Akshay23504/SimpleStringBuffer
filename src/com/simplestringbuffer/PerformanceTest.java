package com.simplestringbuffer;

public class PerformanceTest {

    static long startTime, stopTime;
    static String string;
    static String s1 = "String One";
    static String s2 = "String Two";
    static String s3 = "String Three";
    static String s4 = "String Four";
    static String s5 = "String Five";
    static String string1 = "String One";
    static String string2 = "String One";
    static String string3 = "String One";

    public static void main(String[] args) {
        startTime = System.currentTimeMillis();
        StringConcatenationUsingPlus();
        stopTime = System.currentTimeMillis();
        System.out.println(string1);
        System.out.println(stopTime - startTime + "\n" + (stopTime - startTime) / 1000000.0);

        startTime = System.currentTimeMillis();
        StringConcatenationUsingConcat();
        stopTime = System.currentTimeMillis();
        System.out.println(string2);
        System.out.println(stopTime - startTime + "\n" + (stopTime - startTime) / 1000000.0);

        SimpleStringBuffer simpleStringBuffer = new SimpleStringBuffer(s1);
        startTime = System.currentTimeMillis();
        for(long i = 0; i < 10000; i++) {
            simpleStringBuffer = new SimpleStringBuffer("First String");
            simpleStringBuffer.append("Second String");
            simpleStringBuffer.append("Third String");
            simpleStringBuffer.append("Fourth String");
            //simpleStringBuffer.append("Second String");
/*            simpleStringBuffer.append(s3);
            simpleStringBuffer.append(s4);
            simpleStringBuffer.append(s5);*/
        }
        string = simpleStringBuffer.toString();
        stopTime = System.currentTimeMillis();
        System.out.println(string);
        System.out.println(stopTime - startTime + "\n" + (stopTime - startTime) / 1000000.0);
    }

    private static void StringConcatenationUsingPlus() {
        for(long i = 0; i < 10000; i++) {
            //s = s + s1 + s2 + s3 + s4 + s5;
            //s = s.concat(s1).concat(s2).concat(s3).concat(s4).concat(s5);
            string1 = "First String" + "Second String" + "Third String" + "Fourth String";
        }
    }

    private static void StringConcatenationUsingConcat() {
        for(long i = 0; i < 10000; i++) {
            string2 = "First String".concat("Second String").concat("Third String").concat("Fourth String");
        }
    }

}
