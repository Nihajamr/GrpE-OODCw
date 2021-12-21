public class Van extends Vehicle{

    protected String modal;

    public Van() {
        super();
    }

    public Van(String vehicleRegNo, int noOfPassengers, String modal,String ownerName,String date,String stime) {
        super();
        this.modal = modal;
        this.setVehicleRegNo(vehicleRegNo);
        this.setNoOfPassengers(noOfPassengers);
        this.setOwnerName(ownerName);
        this.setDate(date);
        this.setStime(stime);

    }

    public String getStatus(){
        return modal;
    }

    @Override
    public String toString() {
        return "Van{" +
                "modal='" + modal + '\'' +
                ", vehicleRegNo='" + getVehicleRegNo() + '\'' +
                ", ownerName='" + getOwnerName() + '\'' +
                ", noOfPassengers=" + getNoOfPassengers() +
                ", date='" + getDate() + '\'' +
                ", stime='" + getStime() + '\'' +
                '}';
    }
}

