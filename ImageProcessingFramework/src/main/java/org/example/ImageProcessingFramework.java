package org.example;

public class ImageProcessingFramework {
    private FilterStrategy filterStrategy;
    private CompressionTemplate compressionTemplate;

    public void setFilterStrategy(FilterStrategy filterStrategy) {
        this.filterStrategy = filterStrategy;
    }

    public void setCompressionTemplate(CompressionTemplate compressionTemplate) {
        this.compressionTemplate = compressionTemplate;
    }

    public void processImage(int[] data) {
        if (filterStrategy != null) {
            data = filterStrategy.filter(data);
        }
        if (compressionTemplate != null) {
            data = compressionTemplate.compress(data);
        }
    }
}
