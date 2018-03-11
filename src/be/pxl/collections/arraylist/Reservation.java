package be.pxl.collections.arraylist;

public class Reservation {

    public static void main(String[] args) {
        Theatre theatre = new Theatre("Ethias Arena", 15, 12);
        theatre.displayMap();
        theatre.reservateSeat("A01");
        theatre.reservateSeat("O07");
        theatre.displayMap();
    }
}
