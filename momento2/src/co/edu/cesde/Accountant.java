package co.edu.cesde;

public class Accountant extends Person {
    public String leader;
    public String parking;

    public String getLeader() {
        return leader;
    }

    public void setLeader(String leader) {
        this.leader = leader;
    }

    public String getParking() {
        return parking;
    }

    public void setParking(String parking) {
        this.parking = parking;
    }

    public Accountant(String name, String identification, int age, String leader, String parking){
        super(name, identification, age);
        this.leader = leader;
        this.parking = parking;
    }

}
