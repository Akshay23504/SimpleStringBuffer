package com.simplestringbuffer;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Akshay.A on 1/4/2016.
 */
public class NewSimpleStringBufferTest {

    @Test
    public void shouldReturnEmptyStringWhenToStringIsCalledForEmptyStringBuffer() {
        NewSimpleStringBuffer newSimpleStringBuffer = new NewSimpleStringBuffer();

        assertEquals("", newSimpleStringBuffer.toString());
    }

    @Test
    public void shouldReturnAWhenToStringIsCalledForStringBufferWithInitialValueAsA() {
        NewSimpleStringBuffer newSimpleStringBuffer = new NewSimpleStringBuffer("A");

        assertEquals("A", newSimpleStringBuffer.toString());
    }

    @Test
    public void shouldReturnTheSameStringWhenToStringIsCalledForParameterizedStringBuffer() {
        NewSimpleStringBuffer newSimpleStringBuffer = new NewSimpleStringBuffer("");

        assertEquals("", newSimpleStringBuffer.toString());
    }

    @Test
    public void shouldContainEmptyStringWhenEmptyStringIsPassedToAppendWhenInitialValueIsEmpty() {
        NewSimpleStringBuffer newSimpleStringBuffer = new NewSimpleStringBuffer("");

        newSimpleStringBuffer.append("");

        assertEquals("", newSimpleStringBuffer.toString());
    }

    @Test
    public void shouldContainAWhenEmptyStringIsPassedToAppendWhenInitialValueIsA() {
        NewSimpleStringBuffer newSimpleStringBuffer = new NewSimpleStringBuffer("A");

        newSimpleStringBuffer.append("");

        assertEquals("A", newSimpleStringBuffer.toString());
    }

    @Test
    public void shouldContainAWhenAIsPassedToAppendWhenInitialValueIsEmpty() {
        NewSimpleStringBuffer newSimpleStringBuffer = new NewSimpleStringBuffer("");

        newSimpleStringBuffer.append("A");

        assertEquals("A", newSimpleStringBuffer.toString());
    }

    @Test
    public void shouldContainABWhenBIsPassedToAppendWhenInitialValueIsA() {
        NewSimpleStringBuffer newSimpleStringBuffer = new NewSimpleStringBuffer("A");

        newSimpleStringBuffer.append("B");

        assertEquals("AB", newSimpleStringBuffer.toString());
    }

    @Test
    public void shouldContainABWhenABIsPassedToAppendWhenInitialValueIsEmpty() {
        NewSimpleStringBuffer newSimpleStringBuffer = new NewSimpleStringBuffer("");

        newSimpleStringBuffer.append("AB");

        assertEquals("AB", newSimpleStringBuffer.toString());
    }

    @Test
    public void shouldContainABABWhenABIsPassedToAppendWhenInitialValueIsAB() {
        NewSimpleStringBuffer newSimpleStringBuffer = new NewSimpleStringBuffer("AB");

        newSimpleStringBuffer.append("AB");

        assertEquals("ABAB", newSimpleStringBuffer.toString());
    }

}
