public class Car extends Vehicle{

    protected String brand;

    public Car() {
        super();
    }

    public Car(String vehicleRegNo, int noOfPassengers, String brand,String ownerName, String date,String stime) {
        super();
        this.setVehicleRegNo(vehicleRegNo);
        this.setNoOfPassengers(noOfPassengers);
        this.brand = brand;
        this.setOwnerName(ownerName);
        this.dt.setDate(date);
        this.dt.setStime(stime);
    }


    @Override
    public String getStatus(){

        return brand;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", vehicleRegNo='" + getVehicleRegNo() + '\'' +
                ", ownerName='" + getOwnerName() + '\'' +
                ", noOfPassengers=" + getNoOfPassengers()+
                ", date='" + dt.getDate() + '\'' +
                ", stime='" + dt.getStime() + '\'' +
                '}';
    }
}

