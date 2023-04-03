package test;

import dao.PassengerCSVDAO;
import model.Passenger;

import java.util.List;

public class TestSER3 {

    public static void test(){
        List<Passenger> passengers = PassengerCSVDAO.readAll();
        PassengerCSVDAO.writeAll(passengers);
    }
}
