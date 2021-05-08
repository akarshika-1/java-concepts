package design_pattern.factory_pattern;

public class FactoryPatternMainClass {

    public static void main(String[] args) {
        ProfessionFactory professionFactory = new ProfessionFactory();
        Profession profession = professionFactory.getProfession("Engineer");
        profession.execute();
    }
}
