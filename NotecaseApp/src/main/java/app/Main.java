package app;

import controller.Controller;
import gui.LoginPanel;
import java.util.ArrayList;
import java.util.List;
import model.FeeFare;
import model.JourneyFare;
import model.RoundTripFare;
import model.Trip;
import model.VehicleFare;


public class Main {

    public static void main(String[] args) {
        List<JourneyFare> journeys = new ArrayList<>();
        List<String> hours = new ArrayList<>();
        List<FeeFare> fees = new ArrayList<>();
        List<VehicleFare> vehicles = new ArrayList<>();
        List<RoundTripFare> roundTrips = new ArrayList<>();
        
        Trip model = new Trip(journeys, hours, fees, vehicles, roundTrips);
        inicializar_model(model);
        
        Controller controller = new Controller(model);
        LoginPanel view = new LoginPanel(controller);
        
        java.awt.EventQueue.invokeLater(() -> {
            view.setVisible(true);
        });
    }
    
    
    private static void inicializar_model(Trip model) {
        model.addJourney(new JourneyFare("isla salida", "isla destino", "hora", 0));
        model.addJourney(new JourneyFare("GRAN CANARIA", "TENERIFE", "18:00", 48.66));
        model.addJourney(new JourneyFare("TENERIFE", "LA PALMA", "21:00", 62.73));
        model.addJourney(new JourneyFare("FUERTEVENTURA", "LA PALMA", "12:00", 95.53));
        model.addJourney(new JourneyFare("LA GOMERA", "GRAN CANARIA", "15:00", 81.06));
        model.addJourney(new JourneyFare("LA PALMA", "LA GOMERA", "09:00", 62.73));
        model.addFee(new FeeFare("BÁSICA", 1));
        model.addFee(new FeeFare("ÓPTIMA", 1.35));
        model.addFee(new FeeFare("CONFORT", 1.65));
        model.addVehicle(new VehicleFare("SIN VEHÍCULO", 0.0));
        model.addVehicle(new VehicleFare("TURISMO", 8.58));
        model.addVehicle(new VehicleFare("VEHÍCULO GRANDE", 22.56));
        model.addVehicle(new VehicleFare("CICLOMOTOR", 9.37));
        model.addVehicle(new VehicleFare("BICICLETA", 7.4));
        model.addVehicle(new VehicleFare("MOTOCICLETA", 11.99));
        model.addRoundTrip(new RoundTripFare("Solo ida", 1));
        model.addRoundTrip(new RoundTripFare("Ida y Vuelta", 2));
    }
}