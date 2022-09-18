package ParkingLotOOD;

import ParkingLotOOD.Spots.ParkingSpot;
import ParkingLotOOD.Ticket.PayPrice;
import ParkingLotOOD.Ticket.Ticket;
import ParkingLotOOD.Vehicles.Vehicle;

import java.time.LocalTime;
import java.util.List;


// 我设计的是4层的停车场，每层停车位数量是一样的，我的车位的type是 small,medium,large, electrical,
// 我想在Floors 里写 每层每个车型剩多少，但是写不出来，一直会报错
// 然后我写了ticket的系统，记录进场时间，出场时间拿localtime - 进场时间就行，然后要付多少钱我写了method，但是不会写payment system， 不知道重不重要
// 然后我也没有写 multiple entry 和 exit
public class ParkingLot {
    private Vehicle vehicle;
    private List<Floors> floorsList;
    private List<ParkingSpot> parkingSpotList;
    private boolean isFull;
    private int remainingSpots;
    private Ticket ticket;

    // 不知道要不要写下面这些东西


    public Ticket getTicket () {
        return ticket;
    }
    public double PayPrice (LocalTime time){
        return ticket.leave(time);
    }
    public static int totalSize;
    public boolean isFull () {
        return remainingSpots == 0;
    }
    public static int getSize () {
        return totalSize / 4;
    }

}
