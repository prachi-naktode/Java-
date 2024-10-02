package com.prachi.stringBuilderBuffer;

public class Main {
    public static void main(String[] args) {
        long startTime = System.nanoTime();

        // Using StringBuilder for fast concatenation in a single-threaded environment
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            builder.append("Java ");
        }

        long endTime = System.nanoTime();
        System.out.println("Time taken with StringBuilder: " + (endTime - startTime) + " nanoS");

        startTime = System.nanoTime();
        // Using StringBuffer for thread-safe concatenation
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < 10000; i++) {
            buffer.append("Java ");
        }
        endTime = System.nanoTime();
        System.out.println("Time taken with StringBuffer: " + (endTime - startTime) + " nanoS");
    }
}
