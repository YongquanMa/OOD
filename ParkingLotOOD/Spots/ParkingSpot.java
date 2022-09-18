package ParkingLotOOD.Spots;

import ParkingLotOOD.Vehicles.Vehicle;

public abstract class ParkingSpot  {
    private int spotNumber;
    private boolean isAvailable;
    private Vehicle vehicle;
    public ParkingSpotType parkingSpotType;
    public ParkingSpot(ParkingSpotType parkingSpotType){
        this.parkingSpotType = parkingSpotType;
    }
    public boolean Parking(Vehicle vehicle){
        this.vehicle = vehicle;
        isAvailable = false;
        return false;
    }
    public boolean carLeaving(){
        this.vehicle = null;
        isAvailable = true;
        return true;
    }

    public ParkingSpotType getType () {
        return parkingSpotType;
    }

    public Integer getNumber () {
        return spotNumber;
    }
}
