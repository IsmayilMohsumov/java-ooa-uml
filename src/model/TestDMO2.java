package model;

public class TestDMO2 {

    public static void main(String[] args) {
        Passenger person = new Passenger();
        //"Passenger [name="Abbing, Mr Anthony", survived="true"]";
        person.setName("Abbing, Mr Anthony");
        person.setSurvived(true);

        System.out.println(person.toString());
    }
}
