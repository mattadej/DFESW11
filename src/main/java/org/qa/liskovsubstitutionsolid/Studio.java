package org.qa.liskovsubstitutionsolid;

public class Studio extends Apartment{

    public Studio() {
        this.setNumberOfBedrooms(0);
    }

    @Override
    public void setSquareFootage(int sqft) {
        this.setSquareFootage(sqft);
    }

}