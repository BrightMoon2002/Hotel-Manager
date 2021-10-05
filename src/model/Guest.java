package model;

import java.time.LocalDate;

public class Guest {
private String name;
private String identityCard;
private String dayOfBirth;

    public Guest() {
    }

    public Guest(String name, String identityCard, String dayOfBirth) {
        this.name = name;
        this.identityCard = identityCard;
        this.dayOfBirth = dayOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }

    public String getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(String dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }


    @Override
    public String toString() {
        return "Guest{" +
                "name='" + name + '\'' +
                ", identityCard='" + identityCard + '\'' +
                ", dayOfBirth='" + dayOfBirth + '\'' +
                '}';
    }
}
