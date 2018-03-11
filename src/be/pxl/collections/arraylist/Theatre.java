package be.pxl.collections.arraylist;
import java.util.ArrayList;
import java.util.List;

public class Theatre {
    private String theatreName;
    private List<Seat> seats = new ArrayList<>();
    private int seatsPerRow;
    private int numRows;

    public Theatre(String theatreName, int numRows, int seatsPerRow) {
        this.theatreName = theatreName;
        this.seatsPerRow = seatsPerRow;
        this.numRows = numRows;

        for (char row = 'A'; row <= 'A' + numRows; row++) {
            for (int seatNum = 1; seatNum <= seatsPerRow; seatNum++) {
                seats.add(new Seat(row + String.format("%02d", seatNum)));
            }
        }
    }

    public void displayMap() {
        int count = 0;
        for (Seat seat : seats) {
            System.out.print(seat + " ");
            count++;
            if (count % seatsPerRow == 0) {
                System.out.println();
            }
        }
    }

    public boolean reservateSeat(String seatNumber) {
        Seat requestedSeat = getSeatBySeatNumber(seatNumber);
        if (requestedSeat != null) {
            return requestedSeat.reserve();
        }
        return false;
    }

    private Seat getSeatBySeatNumber(String seatNumber) {
        for (Seat seat : seats) {
            if (seat.getSeatNumber().equals(seatNumber)) {
                return seat;
            }
        }
        return null;
    }


    private class Seat {
        private String seatNumber;
        private boolean reserved = false;

        public Seat(String seatNumber) {
            this.seatNumber = seatNumber;
        }

        public String getSeatNumber() {
            return seatNumber;
        }

        public boolean reserve() {
            if (isReserved()) {
                System.out.println("Seat " + seatNumber + " already reserved.");
                return false;
            }
            reserved = true;
            return reserved;
        }

        public boolean isReserved() {
            return reserved;
        }

        @Override
        public String toString() {
            return (reserved ? "*" : "") + seatNumber + (reserved ? "*" : "");
        }
    }
}
