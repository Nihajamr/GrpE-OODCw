public class Bike extends Vehicle{
    protected String capacity;

    public Bike() {
        super();
    }

    public Bike(String vehicleRegNo, int noOfPassengers, String ownerName, String date, String stime, String capacity) {
        super();
        this.capacity = capacity;
        this.setVehicleRegNo(vehicleRegNo);
        this.setNoOfPassengers(noOfPassengers);
        this.setOwnerName(ownerName);
        this.dt.setDate(date);
        this.dt.setStime(stime);
    }

    @Override
    public String getStatus(){

        return capacity;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "capacity='" + capacity + '\'' +
                ", vehicleRegNo='" + getVehicleRegNo() + '\'' +
                ", ownerName='" + getOwnerName()+ '\'' +
                ", noOfPassengers=" + getNoOfPassengers() +
                ", date='" + dt.getDate() + '\'' +
                ", stime='" + dt.getStime() + '\'' +
                '}';
    }
}
