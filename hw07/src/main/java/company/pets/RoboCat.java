package company.pets;

import company.Species;
import company.abstracts.Foul;
import company.abstracts.Pet;

public class RoboCat extends Pet implements Foul {
    public RoboCat(){
        super.setSpecies(Species.ROBOCAT);

    }
    public RoboCat( String nickName, int age, int trickLevel, String[] habits){
        super(nickName, age, trickLevel, habits);
        super.setSpecies(Species.ROBOCAT);
    }
    @Override
    public void respond() {
        System.out.println(this.getNickName() + "Responding");

    }

    @Override
    public void foul() {
        System.out.println(this.getNickName() + "Foul");

    }
}
