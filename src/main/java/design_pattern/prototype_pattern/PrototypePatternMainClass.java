package design_pattern.prototype_pattern;

public class PrototypePatternMainClass {
    public static void main(String[] args) {
        ProfessionCache.loadProfessionCache();
        //Different hash codes will be printed, it means a clone is created everytime
        Profession doctorProfession1 = ProfessionCache.getCloneNewProfession(1);
        System.out.println(doctorProfession1);
        Profession doctorProfession2 = ProfessionCache.getCloneNewProfession(1);
        System.out.println(doctorProfession2);

        Profession engineerProfession1 = ProfessionCache.getCloneNewProfession(2);
        System.out.println(engineerProfession1);
        Profession engineerProfession2 = ProfessionCache.getCloneNewProfession(2);
        System.out.println(engineerProfession2);


    }
}
