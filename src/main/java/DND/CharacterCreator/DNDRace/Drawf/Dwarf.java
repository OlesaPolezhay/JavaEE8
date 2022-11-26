package DND.CharacterCreator.DNDRace.Drawf;

import DND.CharacterCreator.DNDRace.CharacterRace;
import DND.CharacterCreator.Stats;

public class Dwarf extends CharacterRace {

    Dwarf(String name, Stats stat){
        this.name=name;
        this.bonuses=stat;
    }

    @Override
    public void shout() {
        System.out.println("Baruk Khazâd! Khazâd ai-mênu!");
    }

}