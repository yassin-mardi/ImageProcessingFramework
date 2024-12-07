package org.example;

public class BlurFilter implements FilterStrategy {
    @Override
    public int[] filter(int[] data) {
        System.out.println("Applying Blur Filter");
        return data; // Add your filtering logic here
    }
}