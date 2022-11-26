package DND.CharacterCreator.DNDRace;

public class RaceFactory {

    public static CharacterRace getRace(RaceAbstractFactory factory,String type){
        return factory.create(type);
    }

}
