public interface CarParkManager {
    void addVehicle(Vehicle vehicle);
    void deleteVehicle(String RegNO);
    void findVehicle(String RegNo);
    void printPercentage();
    void printReceipt();
    boolean details();
}
class Main {
    public static void main(String[] args){
        System.out.println("=================================================================");
        System.out.println("                    WELCOME TO THE CAR PARK");
        System.out.println("=================================================================");
        System.out.println("");
        CarParkManager carPark = new IITCarParkManager();
        boolean exit = false;
        while (!exit){
            exit = carPark.details();
        }
    }
}

