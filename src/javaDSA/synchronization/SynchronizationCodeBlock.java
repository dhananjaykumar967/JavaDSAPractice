package javaDSA.synchronization;

class SynchronizationCodeBlock {

}
class BookTheaterSeat1 {
    int total_seat = 10;

    void bookSeat(int seats) {
        synchronized (this){
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
}


class MovieBookApp1 extends Thread {
    static BookTheaterSeat bts;
    int seats;

    public void run() {
        bts.bookSeat(seats);
    }

    public static void main(String[] args) {
        bts = new BookTheaterSeat();
        MovieBookApp1 mB1 = new MovieBookApp1();
        mB1.seats = 7;
        mB1.start();

        MovieBookApp1 mB2 = new MovieBookApp1();
        mB2.seats = 6;
        mB2.start();
    }
}

