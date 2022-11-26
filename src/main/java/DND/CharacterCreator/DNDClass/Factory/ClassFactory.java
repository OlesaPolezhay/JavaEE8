package DND.CharacterCreator.DNDClass.Factory;

import DND.CharacterCreator.DNDClass.Classes.Barbarian;
import DND.CharacterCreator.DNDClass.Classes.Bard;
import DND.CharacterCreator.DNDClass.Classes.CharacterClass;

public class ClassFactory {
    public static CharacterClass getClass(String type){
        if("Barbarian".equalsIgnoreCase(type)) return new Barbarian();
        else if("Wizard".equalsIgnoreCase(type)) return new Bard();
        return null;
    }

}
