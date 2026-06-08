import java.util.Scanner;

public class bookticket {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] seats = new int[5][3];

        while (true) {

            System.out.println("\n1. Book Ticket");
            System.out.println("2. Cancel Ticket");
            System.out.println("3. View Seats");
            System.out.println("4. Exit");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Row Number (1-5): ");
                    int row = sc.nextInt();

                    System.out.print("Enter Seat Number (1-3): ");
                    int seat = sc.nextInt();

                    if (seats[row - 1][seat - 1] == 0) {
                        seats[row - 1][seat - 1] = 1;
                        System.out.println("Ticket Booked Successfully");
                    } else {
                        System.out.println("Seat Already Filled");
                    }
                    break;

                case 2:
                    System.out.print("Enter Row Number (1-5): ");
                    row = sc.nextInt();

                    System.out.print("Enter Seat Number (1-3): ");
                    seat = sc.nextInt();

                    if (seats[row - 1][seat - 1] == 1) {
                        seats[row - 1][seat - 1] = 0;
                        System.out.println("Ticket Cancelled");
                    } else {
                        System.out.println("Seat Already Empty");
                    }
                    break;

                case 3:
                    System.out.println("\nSeat Status");

                    for (int i = 0; i < 5; i++) {
                        System.out.print("Row " + (i + 1) + ": ");

                        for (int j = 0; j < 3; j++) {
                            if (seats[i][j] == 0)
                                System.out.print("FREE ");
                            else
                                System.out.print("BOOKED ");
                        }
                        System.out.println();
                    }
                    break;

                case 4:
                    System.exit(0);
            }
        }
    }
}