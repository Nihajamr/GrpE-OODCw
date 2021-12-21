public class Main {

    public static class MyRunnable implements Runnable{

        @Override
        public void run() {
            CarParkManager carPark = new IITCarParkManager();
            boolean exit = false;
            while (!exit){
                exit = carPark.mainMenu();
            }
        }
    }
    public static void main(String[] args){
        Thread thread = new Thread(new MyRunnable());
        thread.start();
    }
}
