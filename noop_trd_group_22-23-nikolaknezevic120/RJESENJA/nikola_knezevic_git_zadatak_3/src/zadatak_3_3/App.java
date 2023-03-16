package zadatak_3_3;

import zadatak_3_3.transport.*;

public class App {

    public static void main(String[] args) {
        TransportCLS transportCLS = new TransportCLS();

        //boat transfer
        transportCLS.setTransportType("boat");
        transportCLS.transport();

        //plane
        transportCLS.setTransportType("plane");
        transportCLS.transport();

        //truck
        transportCLS.setTransportType("truck");
        transportCLS.transport();
        
        //testing invalid transport type
        transportCLS.setTransportType("train");
        transportCLS.transport();
        
        //van
        transportCLS.setTransportType("van");
        transportCLS.transport();
        
    }
}
