package ParkingLotOOD.Ticket;

import java.time.LocalTime;
import java.util.HashMap;

public class GetTicket extends Ticket {
    private int id;
    LocalTime enter = LocalTime.now();


    @Override
    public void generate ( HashMap<Integer, LocalTime> map, LocalTime time ) {
        map.put(id,enter);
    }

    @Override
    public double leave (  LocalTime time ) {
        return 0;
    }
}
