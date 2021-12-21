public class Vehicle {
    protected String vehicleRegNo;
    protected String EntryTime;
    public Vehicle() {
        super();
        vehicleRegNo = null;
        EntryTime = null;
    }
}
class Car extends Vehicle{
    public Car(String vehicleRegNo,String EntryTime) {
        super();
        this.vehicleRegNo = vehicleRegNo;
        this.EntryTime = EntryTime;
    }
}
class Van extends Vehicle{
    public Van(String vehicleRegNo,String EntryTime) {
        super();
        this.vehicleRegNo = vehicleRegNo;
        this.EntryTime = EntryTime;
    }
}
class MiniBus extends Vehicle{
    public MiniBus(String vehicleRegNo,String EntryTime) {
        super();
        this.vehicleRegNo = vehicleRegNo;
        this.EntryTime = EntryTime;
    }
}
class MiniLorry extends Vehicle{
    public MiniLorry(String vehicleRegNo,String EntryTime) {
        super();
        this.vehicleRegNo = vehicleRegNo;
        this.EntryTime = EntryTime;
    }
}
class MotorBike extends Vehicle{
    public MotorBike(String vehicleRegNo,String EntryTime) {
        super();
        this.vehicleRegNo = vehicleRegNo;
        this.EntryTime = EntryTime;
    }
}

