package design_pattern.builder_pattern;

public class FloodResistantBuilder implements Builder {
    private Home floodResistantHome = new Home();
    @Override
    public void buildWalls() {
        floodResistantHome.walls = "water resistant walls";

    }

    @Override
    public void buildFloors() {
        floodResistantHome.floor = "water resistant floors";

    }

    @Override
    public void buildTerrace() {
        floodResistantHome.terrace = "water resistant terrace";

    }

    @Override
    public Home getComplexHomeObject() {
        return floodResistantHome;
    }
}
