package java_8.PredefinedFunctionalInterface.Consumer;

import java.util.function.Consumer;

public class Example2 {

    public static void main(String[] args){
        Consumer<TvSeries> c1 = t -> System.out.println(t.getActor());
        Consumer<TvSeries> c2 = t -> System.out.println(t.getSeriesName());
        TvSeries tvSeries = new TvSeries("Schitt's Creek", "David Rose");
        c1.andThen(c2).accept(tvSeries);
    }
}
