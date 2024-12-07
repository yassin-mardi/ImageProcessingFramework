package org.example;

public class ZipCompression extends CompressionTemplate {
    @Override
    protected int[] performCompression(int[] data) {
        System.out.println("Applying ZIP compression.");
        return data;
    }
}
