package DND.CharacterCreator.DNDRace.Elf;

import DND.CharacterCreator.DNDRace.CharacterRace;
import DND.CharacterCreator.Stats;

public class Elf extends CharacterRace {

    Elf(String name, Stats stat){
        this.name=name;
        this.bonuses=stat;
    }

    @Override
    public void shout() {
        System.out.println("A Elbereth Gilthoniel!");
    }

}
