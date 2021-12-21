import java.io.Serializable;
import java.util.Comparator;

public abstract class Vehicle implements Serializable{
    private String vehicleRegNo;
    private String ownerName;
    private int noOfPassengers;
    //private String date;
    //private String stime;
    DateTime dt = new DateTime();

    public Vehicle() {
        super();
        vehicleRegNo = null;
        ownerName = null;
        noOfPassengers = 0;
        //date = null;
    }

    public Vehicle(String vehicleRegNo, int noOfPassengers, String ownerName,String date,String stime) {
        super();
        this.vehicleRegNo = vehicleRegNo;
        this.noOfPassengers = noOfPassengers;
        this.ownerName = ownerName;
        this.dt.setDate(date);
        this.dt.setStime(stime);
    }

    public String getVehicleRegNo() {
        return vehicleRegNo;
    }

    public void setVehicleRegNo(String vehicleRegNo) {
        this.vehicleRegNo = vehicleRegNo;
    }

    public int getNoOfPassengers() {
        return noOfPassengers;
    }

    public void setNoOfPassengers(int noOfPassengers) {
        this.noOfPassengers = noOfPassengers;
    }

    public String getOwnerName(){
        return ownerName;
    }

    public void setOwnerName(String ownerName){
        this.ownerName = ownerName;
    }

    /*public String getDate() {

        return date;
    }

    public void setDate(String date) {

        this.date = date;
    }

    public String getStime() {

        return stime;
    }

    public void setStime(String stime) {

        this.stime = stime;
    }*/

    public abstract String getStatus();

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleRegNo='" + vehicleRegNo + '\'' +
                ", ownerName='" + ownerName + '\'' +
                ", noOfPassengers=" + noOfPassengers +
                ", date='" + dt.getDate() + '\'' +
                ", stime='" + dt.getStime() + '\'' +
                '}';
    }
}

class sortItems implements Comparator<Vehicle> {

    public int compare(Vehicle a, Vehicle b)
    {

        return a.dt.getStime().compareTo(b.dt.getStime());
    }
}
