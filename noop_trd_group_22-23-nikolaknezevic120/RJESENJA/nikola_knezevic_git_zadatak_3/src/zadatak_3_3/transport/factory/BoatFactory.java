package zadatak_3_3.transport.factory;

import zadatak_3_3.transport.factory.concrete.BoatTransport;
import zadatak_3_3.transport.factory.concrete.Transport;

public class BoatFactory implements TransportFactory{

	@Override
	public Transport getTransport() {
        return new BoatTransport();
	}

}
