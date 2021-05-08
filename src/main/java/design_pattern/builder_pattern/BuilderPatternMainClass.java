package design_pattern.builder_pattern;

public class BuilderPatternMainClass  {

    public static void main(String[] args) {
        EarthquakeResistantBuilder earthquakeResistantBuilder = new EarthquakeResistantBuilder();
        Director director = new Director(earthquakeResistantBuilder);
        director.manageRequiredHomeConstruction();
        Home homeConstructedAtTheEnd = director.getComplexObjectOfHome();
        System.out.println(homeConstructedAtTheEnd);
        System.out.println(homeConstructedAtTheEnd.floor);
    }
}
