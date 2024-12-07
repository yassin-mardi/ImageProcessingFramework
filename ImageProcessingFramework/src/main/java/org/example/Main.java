package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        ImageProcessingFramework framework = new ImageProcessingFramework();

        System.out.print("Enter Filter Class (BlurFilter/EdgeDetectionFilter): ");
        String filterClass = scanner.nextLine();
        FilterStrategy filter = (FilterStrategy) Class.forName(filterClass).getDeclaredConstructor().newInstance();
        framework.setFilterStrategy(filter);

        System.out.print("Enter Compression Class (ZipCompression/RarCompression): ");
        String compressionClass = scanner.nextLine();
        CompressionTemplate compression = (CompressionTemplate) Class.forName(compressionClass).getDeclaredConstructor().newInstance();
        framework.setCompressionTemplate(compression);

        int[] imageData = {1, 2, 3}; // Example image data
        framework.processImage(imageData);
    }
}
