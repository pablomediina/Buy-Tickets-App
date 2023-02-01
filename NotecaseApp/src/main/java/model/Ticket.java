package model;


public class Ticket {
    private int id;
    private JourneyFare journey;
    private String passengers;
    private RoundTripFare roundTrip;
    private String departureDate;
    private String returnDate;
    private FeeFare fee;
    private VehicleFare vehicle;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public JourneyFare getJourney() {
        return journey;
    }

    public void setJourney(JourneyFare journey) {
        this.journey = journey;
    }

    public String getPassengers() {
        return passengers;
    }

    public void setPassengers(String passengers) {
        this.passengers = passengers;
    }

    public RoundTripFare getRoundTrip() {
        return roundTrip;
    }

    public void setRoundTrip(RoundTripFare roundTrip) {
        this.roundTrip = roundTrip;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    public FeeFare getFee() {
        return fee;
    }

    public void setFee(FeeFare fee) {
        this.fee = fee;
    }

    public VehicleFare getVehicle() {
        return vehicle;
    }

    public void setVehicle(VehicleFare vehicle) {
        this.vehicle = vehicle;
    }
}