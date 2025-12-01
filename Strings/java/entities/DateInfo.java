package entities;

public class DateInfo {
    private Integer day;
    private Integer month;
    private Integer year;

    public DateInfo(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year; 
    }

    @Override
    public String toString() {
        return "Day: " + this.day
            +   "\nMonth: " + this.month
            +   "\nYear: " + this.year;
    }
}
