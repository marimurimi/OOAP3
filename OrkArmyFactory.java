package sample;

public class OrkArmyFactory extends Army{
    @Override
    public Warlord warlord(){
        return new  OrkWarlord();
    }

    @Override
    public General general(){
        return new OrkGeneral();
    }

    @Override
    public Soldiery soldiery(){
        return new OrkSoldiery();
    }
}
