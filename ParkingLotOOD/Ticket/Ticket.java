package ParkingLotOOD.Ticket;

import java.time.LocalTime;
import java.util.HashMap;

public abstract class Ticket {
    LocalTime enter = LocalTime.now();
    HashMap<Integer,LocalTime> map = new HashMap<>();
    public abstract void generate ( HashMap<Integer, LocalTime> map, LocalTime time );
    public abstract double leave(LocalTime time);
}
