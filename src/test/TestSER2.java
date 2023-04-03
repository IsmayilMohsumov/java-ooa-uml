package test;

import dao.PassengerCSVDAO;
import model.Passenger;

public class TestSER2 {
    public static void test(){
        System.out.println(PassengerCSVDAO.readAll());
    }
}
