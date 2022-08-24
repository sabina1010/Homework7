package company.humans;

import company.Family;
import company.Human;

public final class Man extends Human {
    public void repairCar(){
        System.out.println(this.getName()+ " " + this.getSurname()+  " Repair Mercedes");
    }
    public void greetPet() {
        System.out.println("Hello from Mr." + super.getName());
    }

    public Man (){

    }
    public Man(String name, String surname, int year, int iq, String[][] schedule, Family family){
        super(name,surname,year,iq,schedule,family);
    }
    public Man(String name, String surname, int year){
        super(name,surname,year);
    }

}
