package BusReservation;
import java.util.ArrayList;
import java.util.Scanner;
public class BusDemo {

	public static void main(String[] args) {
		ArrayList<Bus> buslist = new ArrayList<Bus>();
		buslist.add(new Bus(1,true,3));
		buslist.add(new Bus(2,false,2));
		buslist.add(new Bus(4,true,2));
		buslist.add(new Bus(3,true,5));
		ArrayList<Booking> bookings = new ArrayList<Booking>();
		
		for(Bus b:buslist) {
			b.displayBusInfo();
		}
		Scanner sc = new Scanner(System.in);
		int userinput = 1;
		while(userinput==1) {
			System.out.println("Enter 1 for Booking and enter 2 to exit");
			userinput = sc.nextInt();
			if(userinput == 1) {
				Booking booking = new Booking();
				booking.isAvailable(buslist,bookings);
				bookings.add(booking);
				System.out.println("Your booking is confirmed");
			}
			else {
				System.out.println("Sorry the seats are full");
			}
		}	
		}		
	}
		


