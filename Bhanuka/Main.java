public class Main {
    public static void main(String[] args){
        CarParkManager carPark = new IITCarParkManager();
        boolean exit = false;
        while (!exit){
            exit = carPark.mainMenu();
        }
    }
}
