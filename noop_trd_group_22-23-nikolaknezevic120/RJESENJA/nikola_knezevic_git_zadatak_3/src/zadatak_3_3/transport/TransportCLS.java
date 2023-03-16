package zadatak_3_3.transport;

import java.util.HashMap;
import java.util.Map;

import zadatak_3_3.transport.factory.*;
import zadatak_3_3.transport.factory.concrete.*;

public class TransportCLS {
    private String transportType;
    private Map<String, TransportFactory> factories;
    
    public TransportCLS() {    	
    	this.factories = new HashMap<>();
    	factories.put("boat", new BoatFactory());
    	factories.put("plane", new PlaneFactory());
    	factories.put("truck", new TruckFactory());
    	factories.put("van", new VanFactory());
    }
    
    public void setTransportType(String transportType) {
        this.transportType = transportType;
    }

    public void transport() {
    	TransportFactory transportFactory = factories.get(transportType);
    	if (transportFactory == null) {
    		System.out.println("----------------\n" + transportType + " is invalid transport type");
    	} else{
	        TransportFactory factory = getConcreteFactory(transportType);
	        Transport transportVehicle = factory.getTransport();
	        System.out.println("----------------\nCreated " + transportVehicle);
	        transportVehicle.transport();
    	}
    }

    private TransportFactory getConcreteFactory(String transportType) {
    	TransportFactory transportFactory = factories.get(transportType);
    	
    	return transportFactory;
    }
}
