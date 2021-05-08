package design_pattern.prototype_pattern;

import java.util.HashMap;
import java.util.Map;

public class ProfessionCache {

    private static Map<Integer, Profession> professionMap = new HashMap<>();

    public static Profession getCloneNewProfession(int id){
        Profession cachedProfessionInstance = professionMap.get(id);
        return (Profession)cachedProfessionInstance.cloningMethod();
    }


    public static void loadProfessionCache(){
        Doctor doctor = new Doctor();
        doctor.id = 1;
        professionMap.put(doctor.id, doctor);

        Engineer engineer = new Engineer();
        engineer.id = 2;
        professionMap.put(engineer.id, engineer);

    }
}
