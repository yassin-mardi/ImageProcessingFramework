package org.example;

public class RarCompression extends CompressionTemplate {
    @Override
    protected int[] performCompression(int[] data) {
        System.out.println("Applying RAR compression.");
        return data;
    }
}
