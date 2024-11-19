package interfaces;

import dto.parkingSpot.ParkingSpot;
import enums.ParkingSpotEnum;

import java.lang.reflect.InvocationTargetException;

public interface ParkingSpotService {

    ParkingSpot create(ParkingSpotEnum parkingSpotEnum, Integer floor) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException;
}
