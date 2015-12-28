package com.simplestringbuffer;

import org.junit.Test;

import static org.junit.Assert.*;

public class SimpleStringBufferTest {

    @Test
    public void shouldReturnEmptyStringWhenToStringIsCalledForEmptyStringBuffer() {
        SimpleStringBuffer simpleStringBuffer = new SimpleStringBuffer();

        assertEquals("", simpleStringBuffer.toString());
    }

    @Test
    public void shouldReturnAWhenToStringIsCalledForStringBufferWithInitialValueAsA() {
        SimpleStringBuffer simpleStringBuffer = new SimpleStringBuffer("a");

        assertEquals("a", simpleStringBuffer.toString());
    }

    @Test
    public void shouldReturnTheSameStringWhenToStringIsCalledForParameterizedStringBuffer() {
        SimpleStringBuffer simpleStringBuffer = new SimpleStringBuffer("");

        assertEquals("", simpleStringBuffer.toString());
    }

    @Test
    public void shouldContainEmptyStringWhenEmptyStringIsPassedToAppendWhenInitialValueIsEmpty() {
        SimpleStringBuffer simpleStringBuffer = new SimpleStringBuffer("");

        simpleStringBuffer.append("");

        assertEquals("", simpleStringBuffer.toString());
    }

    @Test
    public void shouldContainAWhenEmptyStringIsPassedToAppendWhenInitialValueIsA() {
        SimpleStringBuffer simpleStringBuffer = new SimpleStringBuffer("A");

        simpleStringBuffer.append("");

        assertEquals("A", simpleStringBuffer.toString());
    }

    @Test
    public void shouldContainAWhenAIsPassedToAppendWhenInitialValueIsEmpty() {
        SimpleStringBuffer simpleStringBuffer = new SimpleStringBuffer("");

        simpleStringBuffer.append("A");

        assertEquals("A", simpleStringBuffer.toString());
    }

    @Test
    public void shouldContainABWhenBIsPassedToAppendWhenInitialValueIsA() {
        SimpleStringBuffer simpleStringBuffer = new SimpleStringBuffer("A");

        simpleStringBuffer.append("B");

        assertEquals("AB", simpleStringBuffer.toString());
    }

    @Test
    public void shouldContainABWhenABIsPassedToAppendWhenInitialValueIsEmpty() {
        SimpleStringBuffer simpleStringBuffer = new SimpleStringBuffer("");

        simpleStringBuffer.append("AB");

        assertEquals("AB", simpleStringBuffer.toString());
    }

    @Test
    public void shouldContainABABWhenABIsPassedToAppendWhenInitialValueIsAB() {
        SimpleStringBuffer simpleStringBuffer = new SimpleStringBuffer("AB");

        simpleStringBuffer.append("AB");

        assertEquals("ABAB", simpleStringBuffer.toString());
    }

}