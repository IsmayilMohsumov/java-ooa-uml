package test;

import dao.PassengerCSVDAO;
import service.PassengerDataService;

public class TestBLI2 {
    public static void test(){
        System.out.println(PassengerDataService.filterSurvived(PassengerCSVDAO.readAll(), true));
    }
}
