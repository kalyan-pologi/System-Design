package dto;

import enums.ParkingSpotEnum;

import java.util.HashMap;
import java.util.Map;

public class DisplayBoard {
    private static DisplayBoard displayBoard = null;
    private Map<ParkingSpotEnum, Integer> freeParkingSpots;

    private DisplayBoard() {
        this.freeParkingSpots = new HashMap<>();
    }

    public static DisplayBoard getInstance(){
        if (displayBoard == null){
            // Thread safe - block level synchronize
            synchronized (DisplayBoard.class){
                if (displayBoard == null){
                    displayBoard = new DisplayBoard();
                }
            }
        }
        return displayBoard;
    }

    public Map<ParkingSpotEnum, Integer> getFreeParkingSpots() {
        return freeParkingSpots;
    }
}
