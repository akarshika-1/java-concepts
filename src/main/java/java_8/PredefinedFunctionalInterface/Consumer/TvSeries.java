package java_8.PredefinedFunctionalInterface.Consumer;

public class TvSeries {

    private String seriesName;
    private String actor;

    public TvSeries(String seriesName, String actor) {
        this.seriesName = seriesName;
        this.actor = actor;
    }

    public String getSeriesName() {
        return seriesName;
    }

    public void setSeriesName(String seriesName) {
        this.seriesName = seriesName;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }
}
