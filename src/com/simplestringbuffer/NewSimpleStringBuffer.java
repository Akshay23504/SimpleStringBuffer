package com.simplestringbuffer;

import java.util.Arrays;

/**
 * Created by Akshay.A on 1/4/2016.
 */
public class NewSimpleStringBuffer {

    private char[] content;

    public NewSimpleStringBuffer() {
    }

    public NewSimpleStringBuffer(String initialContent) {
        this.content = new char[initialContent.length() + 16];
        this.content = initialContent.toCharArray();
    }

    public void append(String stringToAppend) {
        int lastPosition = this.content.length;
        if (stringToAppend.length() > 0) {
            this.content = Arrays.copyOf(this.content, lastPosition
                    + stringToAppend.length());
            for (int i = lastPosition; i < content.length; i++) {
                this.content[i] = stringToAppend.charAt(i - lastPosition);
            }
        }
    }

    @Override
    public String toString() {
        if (content != null) {
            return new String(content);
        }
        return "";
    }
}
