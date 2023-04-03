package service;

import model.Passenger;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class PassengerDataService {

    public static List<Passenger> filterSurvived(List<Passenger> passengers, Boolean survived) {
        return passengers.stream().filter(passenger -> passenger.getSurvived().equals(survived))
                .collect(Collectors.toList());
    }

    public static int averageAge(List<Passenger> passengers) {
        int sumOfAges = 0;
        for (Passenger passenger : passengers) {
            sumOfAges += passenger.getAge();
        }

        double averageAge = (double) sumOfAges / passengers.size();

        return (int) averageAge;

    }

    public static Map<Integer, Double> calculateAgeDistribution(List<Passenger> passengers) {
        Map<Integer, Double> ageDistribution = new TreeMap<>();
        int totalPassengers = passengers.size();
        for (Passenger passenger : passengers) {
            int age = passenger.getAge().intValue();
            if (ageDistribution.containsKey(age)) {
                double count = ageDistribution.get(age);
                ageDistribution.put(age, count + 1.0);
            } else {
                ageDistribution.put(age, 1.0);
            }
        }
        for (Map.Entry<Integer, Double> entry : ageDistribution.entrySet()) {
            int age = entry.getKey();
            double count = entry.getValue();
            double percentage = (count / totalPassengers) * 100.0;
            ageDistribution.put(age, percentage);
        }
        return ageDistribution;
    }

}

