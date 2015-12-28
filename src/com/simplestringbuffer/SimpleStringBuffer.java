package com.simplestringbuffer;

import java.util.Arrays;

/**
 * A simple string buffer is like a {@link String}, but can be modified. At any
 * point in time it contains some particular sequence of characters, but
 * the length and content of the sequence can be changed through certain
 * method calls.
 * The principal operation on a {@code SimpleStringBuffer} is the
 * {@code append} method, which accepts a {@link String}. The
 * {@code append} method always adds the characters at the end
 * of the buffer.
 * For example, if {@code z} refers to a simple string buffer object
 * whose current contents are {@code "number"}, then
 * the method call {@code z.append("lock")} would cause the simple
 * string buffer to contain {@code "numberlock"}.
 * The length of the character array is expanded based on the current
 * length of the array and the length of the {@link String} to append.
 * Unless otherwise noted, passing a {@code null} argument to a constructor
 * or method in this class will cause a {@link NullPointerException} to be
 * thrown.
 *
 * @author Akshay
 * @version 1.0
 */

public class SimpleStringBuffer {

    /**
     * Holds the content of initial and appended string
     */
    private char[] content;

    public SimpleStringBuffer() {
    }

    /**
     * Constructs a simple string buffer initialized to the contents of the
     * specified string.
     *
     * @param   initialContent   the initial contents of the character array.
     */
    public SimpleStringBuffer(String initialContent) {
        this.content = initialContent.toCharArray();
    }

    /**
     * Appends the specified {@code String} to the existing sequence.
     * Passing a {@code null} argument to this method will cause a
     * {@link NullPointerException} to be thrown.
     *
     * @param   stringToAppend   the {@code String} to append.
     * @since 1.0
     */
    public void append(String stringToAppend) {
        if (stringToAppend.length() > 0) {
            int lastPosition = this.content.length;
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