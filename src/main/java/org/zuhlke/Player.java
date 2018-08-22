package org.zuhlke;

public class Player {
    private final String name;
    private int place;
    private boolean isInPenaltyBox;
    private int purse;

    public Player(String name, int place, boolean isInPenaltyBox, int purse) {
        this.name = name;
        this.place = place;
        this.isInPenaltyBox = isInPenaltyBox;
        this.purse = purse;
    }

    public String getName() {
        return name;
    }

    public boolean isInPenaltyBox() {
        return isInPenaltyBox;
    }

    public void setInPenaltyBox(boolean inPenaltyBox) {
        isInPenaltyBox = inPenaltyBox;
    }

    public int getPurse() {
        return purse;
    }

    public void increasePurse() {
        this.purse++;
    }

    @Override
    public String toString() {
        return getName();
    }

    public void advance(int roll) {
        place += roll;
        place %= 12;
    }

    public int getPlace() {
        return place;
    }
}
