package java_8.PredefinedFunctionalInterface.Consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Example1 {

    public static void main(String args[]){
        List<TvSeries> tvSeries = new ArrayList<>();
        populate(tvSeries);
        Consumer<TvSeries> c = t -> {
            System.out.println("Tv-Series name : "+ t.getSeriesName());
            System.out.println("Actor name     : "+ t.getActor());
        };
        for(TvSeries ts : tvSeries){
            c.accept(ts);
        }
    }

    public static void populate(List<TvSeries> l){
        l.add(new TvSeries("Breaking bad", "Walter white"));
        l.add(new TvSeries("Friends", "Chandler"));
        l.add(new TvSeries("Modern Family", "Gloria"));
        l.add(new TvSeries("Narcos", "Pablo"));
        l.add(new TvSeries("Big bang theory", "Sheldon"));
    }
}
