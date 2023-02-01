package model;

import java.util.List;


public class Trip {
    List<JourneyFare> journeys;
    List<String> hours;
    List<FeeFare> fees;
    List<VehicleFare> vehicles;
    List<RoundTripFare> roundTrips;
    

    public Trip(List<JourneyFare> journeys, List<String> hours, List<FeeFare> fees, List<VehicleFare> vehicles, List<RoundTripFare> roundTrips) {
        this.journeys = journeys;
        this.hours = hours;
        this.fees = fees;
        this.vehicles = vehicles;
        this.roundTrips = roundTrips;
    }
    
    public void addJourney(JourneyFare destination) {
        journeys.add(destination);
    }
    
    public void addHour(String hour) {
        hours.add(hour);
    }
    
    public void addFee(FeeFare fee) {
        fees.add(fee);
    }
    
    public void addVehicle(VehicleFare vehicle) {
        vehicles.add(vehicle);
    }
    
    public void addRoundTrip(RoundTripFare roundTrip) {
        roundTrips.add(roundTrip);
    }

    public List<JourneyFare> getJourneys() {
        return journeys;
    }

    public List<String> getHours() {
        return hours;
    }

    public List<FeeFare> getFees() {
        return fees;
    }

    public List<VehicleFare> getVehicles() {
        return vehicles;
    }

    public List<RoundTripFare> getRoundTrips() {
        return roundTrips;
    }
}