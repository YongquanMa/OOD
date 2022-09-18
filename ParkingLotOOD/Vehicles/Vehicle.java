package ParkingLotOOD.Vehicles;

import ParkingLotOOD.Ticket.GetTicket;

public abstract class Vehicle {
    private String License;
    private final VehicleType vehicleType;

    private GetTicket ticket;

    public Vehicle(VehicleType vehicleType){
        this.vehicleType = vehicleType;
    }
    public void assignTicket( GetTicket ticket){
        this.ticket = ticket;
    }
}
