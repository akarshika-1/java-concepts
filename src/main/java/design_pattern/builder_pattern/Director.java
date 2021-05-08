package design_pattern.builder_pattern;

public class Director {

    private Builder builder;

    public Director(Builder builderType) {
        this.builder = builderType;
    }

    public Home getComplexObjectOfHome(){
        return this.builder.getComplexHomeObject();
    }

    public void manageRequiredHomeConstruction(){
        this.builder.buildWalls();
        this.builder.buildFloors();
        this.builder.buildTerrace();
    }
}
