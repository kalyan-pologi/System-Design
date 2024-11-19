package services;

import dto.DisplayBoard;
import dto.ParkingLot;
import dto.parkingSpot.ParkingSpot;
import enums.ParkingSpotEnum;
import interfaces.DisplayService;
import interfaces.ParkingService;
import interfaces.ParkingSpotService;

import java.lang.reflect.InvocationTargetException;

public class ParkingSPotServiceImpl implements ParkingSpotService {

    DisplayService displayService = new DisplayServiceImpl();
    @Override
    public ParkingSpot create(ParkingSpotEnum parkingSpotEnum, Integer floor) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        ParkingSpot parkingSpot = (ParkingSpot) parkingSpotEnum.getParkingSpot().getConstructor(Integer.class).newInstance(floor);
        ParkingLot.getInstance().getFreeParkingSpots().get(parkingSpot).add(parkingSpot);
        displayService.update(parkingSpotEnum, 1);
        return parkingSpot;
    }
}
