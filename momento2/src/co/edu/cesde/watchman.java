package co.edu.cesde;

public class watchman extends Person {
    public String weapon;

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String getWorkday() {
        return workday;
    }

    public void setWorkday(String workday) {
        this.workday = workday;
    }

    public String workday;

    public watchman(String name, String identification,int age, String weapon, String workday){
        super (name,identification,age);
        this.weapon = weapon;
        this.workday = workday;
    }

}
