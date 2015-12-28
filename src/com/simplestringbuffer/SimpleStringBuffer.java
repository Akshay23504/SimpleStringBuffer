package com.simplestringbuffer;

import java.util.Arrays;

public class SimpleStringBuffer {

    private char[] content;

    public SimpleStringBuffer(String initialContent) {
        this.content = initialContent.toCharArray();
    }

    public SimpleStringBuffer() {
    }

    public void append(String stringToAppend) {
        if (stringToAppend.length() > 0) {
            int lastPosition = this.content.length;
            this.content = Arrays.copyOf(this.content, lastPosition + stringToAppend.length());
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
