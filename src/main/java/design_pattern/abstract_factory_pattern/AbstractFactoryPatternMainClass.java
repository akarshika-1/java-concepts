package design_pattern.abstract_factory_pattern;

import design_pattern.abstract_factory_pattern.Profession;

public class AbstractFactoryPatternMainClass {
    public static void main(String[] args) {
        AbstractFactory abstractFactory1 = AbstractFactoryProducer.getProfession(true);
        Profession profession1 = abstractFactory1.getProfession("Teacher");
        profession1.execute();

        AbstractFactory abstractFactory2 = AbstractFactoryProducer.getProfession(false);
        Profession profession2 = abstractFactory2.getProfession("Teacher");
        profession2.execute();

        AbstractFactory abstractFactory3 = AbstractFactoryProducer.getProfession(true);
        Profession profession3 = abstractFactory3.getProfession("Engineer");
        profession3.execute();

        AbstractFactory abstractFactory4 = AbstractFactoryProducer.getProfession(false);
        Profession profession4 = abstractFactory4.getProfession("Engineer");
        profession4.execute();
    }
}
