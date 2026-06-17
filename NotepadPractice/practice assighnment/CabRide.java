public class CabRide {

    String driverName = "Amit";
    int totalRides = 150;
    double rideCost = 240.50;
    boolean isPaid = false;

    public static void main(String[] args) {
        CabRide trip = new CabRide();
        trip.showReceipt();
        
        double surgePrice = applySurge(trip.rideCost, 50.0);
        System.out.println(surgePrice);
    }

    public void showReceipt() {
        System.out.println(driverName);
        System.out.println(totalRides);
        System.out.println(isPaid);
    }

    public static double applySurge(double base, double extra) {
        double finalPrice = base + extra;
        return finalPrice;
    }
}