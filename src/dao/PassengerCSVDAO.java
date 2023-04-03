package dao;

import model.Gender;
import model.Passenger;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class PassengerCSVDAO {
    public static List<Passenger> readAll() {
        return List.of(new Passenger("Abdullah", model.Class.FIRST, 22.0, Gender.MAN, true));
    }

    public static void writeAll(List<Passenger> passengers) {
        String csvFile = "data_output.csv";
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(csvFile));
            writer.write("PClass, Name, Sex, Age, Survived\n"); // add header row
            for (Passenger passenger : passengers) {
                String pclass = passenger.getPassengerClass().toString();
                String name = passenger.getName();
                String sex = passenger.getSex().toString();
                String age = passenger.getAge().toString();
                String isSurvived = passenger.getSurvived().toString();
                String combinedString = pclass + ", " + name + ", " + sex + ", " + age + ", " + isSurvived;
                writer.write(combinedString);
            }

            System.out.println("CSV file written successfully!");
        } catch (IOException e) {
            System.err.println("Error writing CSV file: " + e.getMessage());
        } finally {
            try {
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException e) {
                System.err.println("Error closing writer: " + e.getMessage());
            }
        }
    }
}
