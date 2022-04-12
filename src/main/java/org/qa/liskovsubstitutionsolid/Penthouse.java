package org.qa.liskovsubstitutionsolid;

public class Penthouse extends Apartment{

    public Penthouse() {
        this.setNumberOfBedrooms(4);
    }

    @Override
    public void setSquareFootage(int sqft) {
        this.setSquareFootage(sqft);
    }
}
