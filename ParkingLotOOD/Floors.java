package ParkingLotOOD;

import ParkingLotOOD.Exceptions.InvalidSize;
import ParkingLotOOD.Spots.*;

import java.util.HashMap;
import java.util.List;

public class Floors {
    private int levels;
    private int size;
    private int remainingSpots;
    private boolean levelFull;

    private HashMap<Integer,ParkingSpotType> spotHashMap;
    public void updateSpot(ParkingSpot spot)  {
        ParkingSpotType type = spot.getType();
        spotHashMap.put(spot.getNumber(),type);
        size--;
        if(size == 0){
            levelFull = true;
        }
    }

    public boolean isLevelFull () {
        return size == 0;
    }
    public void remove(ParkingSpot spot){
        int number = spot.getNumber();
        spotHashMap.remove(number);
        size += 1;
    }


    public int getRemainingSpots( HashMap<Integer,ParkingSpotType> spotHashMap){
        return ParkingLot.getSize() -  spotHashMap.size();
    }

    // 用不起来spot
//    private HashMap<Integer, SmallSpot> smallSpots;
//    private HashMap<Integer, MediumSpot> mediumSpot;
//    private HashMap<Integer, LargeSpot> largeSpot;
//    private HashMap<Integer, ElectricalSpot> electricalSpot;
//
//    public Floors(int levels){
//        this.levels = levels;
//    }
//
//    public void updateSpot(ParkingSpot spot){
//        switch (spot.getType()){
//            case ParkingSpotType.SMALL:
//                smallSpots.put(spot.getNumber(), spot);
//                break;
//            case LARGE:
//                largeSpot.put(spot.getNumber(), spot);
//                break;
//            case MEDIUM:
//                mediumSpot.put(spot.getNumber(), spot);
//                break;
//            case ELECTRICAL:
//                electricalSpot.put(spot.getNumber(), spot);
//                break;
//        }
//    }


}
