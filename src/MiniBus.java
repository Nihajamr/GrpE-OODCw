public class MiniBus extends Vehicle{

    protected String noOfDoors;

    public MiniBus() {
        super();
    }

    public MiniBus(String vehicleRegNo, int noOfPassengers, String ownerName, String date, String stime, String noOfDoors) {
        super();
        this.setVehicleRegNo(vehicleRegNo);
        this.setNoOfPassengers(noOfPassengers);
        this.setOwnerName(ownerName);
        this.dt.setDate(date);
        this.dt.setStime(stime);
        this.noOfDoors = noOfDoors;
    }

    @Override
    public String getStatus(){

        return noOfDoors;
    }

    @Override
    public String toString() {
        return "MiniBus{" +
                "noOfDoors='" + noOfDoors + '\'' +
                ", vehicleRegNo='" + getVehicleRegNo() + '\'' +
                ", ownerName='" + getOwnerName() + '\'' +
                ", noOfPassengers=" + getNoOfPassengers() +
                ", date='" + dt.getDate() + '\'' +
                ", stime='" + dt.getStime() + '\'' +
                '}';
    }
}

