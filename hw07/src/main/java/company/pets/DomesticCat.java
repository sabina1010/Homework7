package company.pets;

import company.Species;
import company.abstracts.Foul;
import company.abstracts.Pet;

public class DomesticCat extends Pet implements Foul {
    public DomesticCat(){
        super.setSpecies(Species.DOMESTICCAT);

    }
    public DomesticCat( String nickName, int age, int trickLevel, String[] habits){
        super(nickName, age, trickLevel, habits);
        super.setSpecies(Species.DOMESTICCAT);
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
