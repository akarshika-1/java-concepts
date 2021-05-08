package design_pattern.builder_pattern;

public class EarthquakeResistantBuilder implements Builder {
    private Home earthquakeResistantHome = new Home();
    @Override
    public void buildWalls() {
        earthquakeResistantHome.walls = "earthquake resistant walls";

    }

    @Override
    public void buildFloors() {
        earthquakeResistantHome.floor = "earthquake resistant floors";

    }

    @Override
    public void buildTerrace() {
        earthquakeResistantHome.terrace = "earthquake resistant terrace";

    }

    @Override
    public Home getComplexHomeObject() {
        return earthquakeResistantHome;
    }
}
