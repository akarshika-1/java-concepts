package design_pattern.abstract_factory_pattern;

public class ProfessionAbstractFactory extends AbstractFactory{

    @Override
    public Profession getProfession(String professionType) {
        if(professionType==null){
            return null;
        }else if(professionType.equalsIgnoreCase("Engineer")){
            return new Engineer();
        }else if(professionType.equalsIgnoreCase("Teacher")){
            return  new Teacher();
        }
        return null;
    }
}
