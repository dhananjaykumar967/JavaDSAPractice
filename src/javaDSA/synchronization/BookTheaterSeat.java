package javaDSA.synchronization;

public class BookTheaterSeat {
    int total_seat = 10;

    synchronized void bookSeat(int seats) {
        if (seats <= total_seat) {
            System.out.println(seats + " number of seats are booked successfully.....");
            total_seat = total_seat - seats;
            System.out.println(total_seat + " number of seats are left...");
        } else {
            System.out.println("Sorry!!! " + seats + " number of seats are not available...");
            System.out.println("You can only book " + total_seat + " seats at max.");
        }
    }
}

class MovieBookApp extends Thread {
    static BookTheaterSeat bts;
    int seats;

    public void run() {
        bts.bookSeat(seats);
    }

    public static void main(String[] args) {
        bts = new BookTheaterSeat();
        MovieBookApp mB1 = new MovieBookApp();
        mB1.seats = 7;
        mB1.start();

        MovieBookApp mB2 = new MovieBookApp();
        mB2.seats = 6;
        mB2.start();
    }
}
