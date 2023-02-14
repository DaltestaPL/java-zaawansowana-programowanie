package org.sda.task8;

public class ValidatorImpl implements Validator {
    @Override
    public boolean validate(Parcel parcel) {
        return checkDimensionsSum(parcel) && checkDimensions(parcel) && checkWeight(parcel);
    }

    private boolean checkDimensionsSum(Parcel parcel) {
        int dimensions = parcel.getxLength() + parcel.getyLength() + parcel.getzLength();
        if (dimensions > 300) {
            System.out.println("Suma wymiarów przekracza 300");
            return false;
        }
        return true;
    }

    private boolean checkDimensions(Parcel parcel) {
        if (parcel.getxLength() > 30 && parcel.getyLength() > 30 && parcel.getzLength() > 30) {
            return true;
        }
        System.out.println("Wymiar nie może być mniejszy od 30");
        return false;
    }

    private boolean checkWeight(Parcel parcel) {
        if (parcel.isExpress() && parcel.getWeight() <= 15) {
            return true;
        } else return !parcel.isExpress() && parcel.getWeight() <= 30;
    }
}
