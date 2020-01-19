package kata30;

public class Kata30 {

    public static void main(String[] args) {
        Histogram<Integer> histogram = new Histogram<Integer>();
        
        histogram.increment(35);
        histogram.increment(2);
        histogram.increment(35);
        histogram.increment(89);
        histogram.increment(35);
        histogram.increment(89);
        histogram.increment(35);
        
        HistogramDisplay histogramdisplay = new HistogramDisplay(histogram);
        histogramdisplay.execute();
    }
    
}
