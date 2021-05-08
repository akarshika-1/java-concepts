package design_pattern.abstract_factory_pattern;

public class AbstractFactoryProducer {
    public static AbstractFactory getProfession(boolean isTrainee){
        if(isTrainee){
            return new TraineeProfessionAbstractFactory();
        }else{
            return  new ProfessionAbstractFactory();
        }
    }
}
