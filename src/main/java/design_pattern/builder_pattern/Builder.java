package design_pattern.builder_pattern;

public interface Builder {
    void buildWalls();
    void buildFloors();
    void buildTerrace();
    Home getComplexHomeObject();
}
