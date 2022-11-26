package DND.DataVisitor;

import DND.CharacterCreator.DNDClass.Classes.CharacterClass;
import DND.CharacterCreator.DNDRace.CharacterRace;
import DND.CharacterCreator.Stats;
import DND.CharacterCreator.Character;

import java.util.TreeMap;

public interface DataElementsVisitor {
    public TreeMap visit(Character ch);
    public TreeMap visit(CharacterClass cl);
    public TreeMap visit(CharacterRace cr);
    public TreeMap visit(Stats st);

}
