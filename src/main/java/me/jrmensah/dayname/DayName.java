package me.jrmensah.dayname;

import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DayName {
    private LocalDate theDate;
    private String dayOfWeek;
    private String longFormat;
    private String nameWithDay;
    private String female;
    private String male;

    public String getFemale() {
        return female;
    }

    public void setFemale(String female) {
        this.female = female;
    }

    public String getMale() {
        return male;
    }

    public void setMale(String male) {
        this.male = male;
    }

    public DayName() {

    }

    public DayName(String aDate) {
        theDate = LocalDate.parse(aDate);
        dayOfWeek = theDate.getDayOfWeek().name();
    }

    public LocalDate getTheDate() {
        return theDate;
    }

    public void setTheDate(LocalDate theDate) {
        this.theDate = theDate;
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public String getLongFormat() {
        return longFormat;
    }

    public void setLongFormat(String longFormat) {
        DateTimeFormatter wholedate = DateTimeFormatter.ofPattern("dd MMM YYYY");
        this.longFormat = longFormat;
    }
    public String getTheFormattedDay()
    {
        return theDate.format(DateTimeFormatter.ofPattern("EEEE"));
    }

    public String getNameWithDay() {
        return nameWithDay;
    }

    public void setNameWithDay(String nameWithDay) {
        this.nameWithDay = nameWithDay;
    }

public void getDayName() {
    switch (getTheFormattedDay()) {
        case"Monday":
            female = "Adjoa";
            male = "Kojo";
            break;
        case "Tuesday":
            female= "Abena";
            male= "Kwabena";
            break;
        case "Wednesday":
            female= "Akua";
            male= "Kweku";
            break;
        case "Thursday":
            female= "Yaa";
            male= "Yaw";
            break;
        case "Friday":
            female= "Afua";
            male= "Kofi";
            break;
        case "Saturday":
            female= "Ama";
            male= "Kwame";
            break;
        case "Sunday":
            female= "Akosua";
            male= "Kwesi";
            break;
        }
    LocalDate.now();
    }
}