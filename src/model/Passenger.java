package model;

public class Passenger {
    private String name;
    private Class passengerClass;
    private Double age;
    private Gender sex;
    private Boolean survived;

    public Passenger(String name, Class passengerClass, Double age, Gender sex, Boolean survived) {
        this.name = name;
        this.passengerClass = passengerClass;
        this.age = age;
        this.sex = sex;
        this.survived = survived;
    }

    public Passenger() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Class getPassengerClass() {
        return passengerClass;
    }

    public void setPassengerClass(Class passengerClass) {
        this.passengerClass = passengerClass;
    }

    public Double getAge() {
        return age;
    }

    public void setAge(Double age) {
        this.age = age;
    }

    public Gender getSex() {
        return sex;
    }

    public void setSex(Gender sex) {
        this.sex = sex;
    }

    public Boolean getSurvived() {
        return survived;
    }

    public void setSurvived(Boolean survived) {
        this.survived = survived;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "name='" + name + '\'' +
                ", survived=" + survived +
                '}';
    }
}
