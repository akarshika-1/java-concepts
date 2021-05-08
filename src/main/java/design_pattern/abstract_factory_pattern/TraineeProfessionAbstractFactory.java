package design_pattern.abstract_factory_pattern;

public class TraineeProfessionAbstractFactory extends AbstractFactory{
    @Override
    public Profession getProfession(String professionType) {
        if(professionType==null){
            return null;
        }else if(professionType.equalsIgnoreCase("Engineer")){
            return new TraineeEngineer();
        }else if(professionType.equalsIgnoreCase("Teacher")){
            return  new TraineeTeacher();
        }
        return null;
    }
}
