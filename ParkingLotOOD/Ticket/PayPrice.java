package ParkingLotOOD.Ticket;

import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.HashMap;
import java.util.Timer;

public class PayPrice extends Ticket {
    private int id;

    LocalTime time = LocalTime.now();


    @Override
    public void generate ( HashMap<Integer, LocalTime> map, LocalTime time ) {

    }

    @Override
    public double leave (  LocalTime time ) {
        double money = 0;
        LocalTime enter = map.get(id);
        int hours = (int) java.time.Duration.between(enter, time).toHours();
        if(hours <= 1){
            money = 4;
        }else if(money > 1 && money <= 2){
            money = 6;
        }else if(money > 2 && money <= 3){
            money = 7.5;
        }else {
            money = 7.5 + (hours - 3) * 2;
        }
        return money;
    }
}
