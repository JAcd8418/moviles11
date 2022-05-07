package co.edu.cesde;

public class CleaningStaff extends Person {
    public String getDayOff() {
        return dayOff;
    }

    public void setDayOff(String dayOff) {
        this.dayOff = dayOff;
    }

    public String dayOff;

        public CleaningStaff(String name, String identification, int age, String dayOff){
            super(name, identification, age);
            this.dayOff = dayOff;
        }
}
