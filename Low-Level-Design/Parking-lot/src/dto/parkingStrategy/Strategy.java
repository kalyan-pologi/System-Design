package dto.parkingStrategy;

import dto.parkingSpot.ParkingSpot;
import enums.ParkingSpotEnum;

public interface Strategy {
    ParkingSpot findParkingSpot(ParkingSpotEnum parkingSpotEnum);
}
