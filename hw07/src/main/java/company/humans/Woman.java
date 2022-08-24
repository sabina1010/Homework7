package company.humans;

import company.Family;
import company.Human;

public final class Woman extends Human {

    //First method I have created for woman ---->

    public void makeUp(){
        System.out.println("Sabina loves makeUp!");

    }
    public void greetPet(){
        System.out.println("Hello from Ms." + super.getName());
    }
    public Woman (){

    }
    public Woman(String name, String surname, int year, int iq, String[][] schedule, Family family){
        super(name,surname,year,iq,schedule,family);
    }
    public Woman(String name, String surname, int year){
        super(name,surname,year);
    }

    //second method for woman ---->

    public void shopping(){
        System.out.println(this.getName()+ " " + this.getSurname() + " love shopping from Zara");

    }


}
