package single.dimensional.array;
import java.util.Scanner;
public class SingleArrMenu {
	    private boolean[][] seats; // 2D array to represent seat availability

	    // Constructor to initialize the seating arrangement
	    public SingleArrMenu(int rows, int columns) {
	        seats = new boolean[rows][columns]; // false indicates the seat is available
	    }

	    // Method to book a seat
	    public boolean bookSeat(int row, int column) {
	        if (isValidSeat(row, column)) {
	            if (!seats[row][column]) { // If the seat is not already booked
	                seats[row][column] = true; // Book the seat
	                return true;
	            } else {
	                System.out.println("Seat is already booked.");
	                return false;
	            }
	        } else {
	            System.out.println("Invalid seat position.");
	            return false;
	        }
	    }

	    // Method to cancel a booking
	    public boolean cancelBooking(int row, int column) {
	        if (isValidSeat(row, column)) {
	            if (seats[row][column]) { // If the seat is currently booked
	                seats[row][column] = false; // Cancel the booking
	                return true;
	            } else {
	                System.out.println("Seat is not booked.");
	                return false;
	            }
	        } else {
	            System.out.println("Invalid seat position.");
	            return false;
	        }
	    }

	    // Method to check if a seat is available
	    public boolean isSeatAvailable(int row, int column) {
	        if (isValidSeat(row, column)) {
	            return !seats[row][column];
	        } else {
	            System.out.println("Invalid seat position.");
	            return false;
	        }
	    }

	    // Method to display the current seating chart
	    public void displaySeatingChart() {
	        System.out.println("Current Seating Chart:");
	        for (int i = 0; i < seats.length; i++) {
	            for (int j = 0; j < seats[i].length; j++) {
	                if (seats[i][j]) {
	                    System.out.print(" X "); // X represents a booked seat
	                } else {
	                    System.out.print(" O "); // O represents an available seat
	                }
	            }
	            System.out.println();
	        }
	    }

	    // Helper method to validate seat positions
	    private boolean isValidSeat(int row, int column) {
	        return row >= 0 && row < seats.length && column >= 0 && column < seats[row].length;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Initialize seating arrangement
	        System.out.print("Enter number of rows: ");
	        int rows = sc.nextInt();
	        System.out.print("Enter number of columns: ");
	        int columns = sc.nextInt();
	        SingleArrMenu airplane = new SingleArrMenu(rows, columns);

	        // Menu for seat management
	        while (true) {
	            System.out.println("\n1. Book a seat");
	            System.out.println("2. Cancel a booking");
	            System.out.println("3. Check seat availability");
	            System.out.println("4. Display seating chart");
	            System.out.println("5. Exit");
	            System.out.print("Choose an option: ");
	            int option = sc.nextInt();

	            switch (option) {
	                case 1: // Book a seat
	                    System.out.print("Enter row number to book (0-based index): ");
	                    int bookRow = sc.nextInt();
	                    System.out.print("Enter column number to book (0-based index): ");
	                    int bookColumn = sc.nextInt();
	                    airplane.bookSeat(bookRow, bookColumn);
	                    break;
	                case 2: // Cancel a booking
	                    System.out.print("Enter row number to cancel (0-based index): ");
	                    int cancelRow = sc.nextInt();
	                    System.out.print("Enter column number to cancel (0-based index): ");
	                    int cancelColumn = sc.nextInt();
	                    airplane.cancelBooking(cancelRow, cancelColumn);
	                    break;
	                case 3: // Check seat availability
	                    System.out.print("Enter row number to check (0-based index): ");
	                    int checkRow = sc.nextInt();
	                    System.out.print("Enter column number to check (0-based index): ");
	                    int checkColumn = sc.nextInt();
	                    boolean available = airplane.isSeatAvailable(checkRow, checkColumn);
	                    System.out.println("Seat availability: " + (available ? "Available" : "Booked"));
	                    break;
	                case 4: // Display seating chart
	                    airplane.displaySeatingChart();
	                    break;
	                case 5: // Exit
	                    System.out.println("Exiting...");
	                    sc.close();
	                    return;
	                default:
	                    System.out.println("Invalid option. Please try again.");
	            }
	        }
	    }
	}

