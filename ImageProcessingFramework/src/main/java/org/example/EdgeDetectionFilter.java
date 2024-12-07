package org.example;

public class EdgeDetectionFilter implements FilterStrategy {
    @Override
    public int[] filter(int[] data) {
        System.out.println("Applying Edge Detection Filter");
        return data; // Add your filtering logic here
    }
}