package org.example;

public abstract class CompressionTemplate {
    public final int[] compress(int[] data) {
        preProcess(data);
        data = performCompression(data);
        postProcess(data);
        return data;
    }

    protected abstract int[] performCompression(int[] data);

    protected void preProcess(int[] data) {
        System.out.println("Pre-processing data for compression.");
    }

    protected void postProcess(int[] data) {
        System.out.println("Post-processing after compression.");
    }
}
