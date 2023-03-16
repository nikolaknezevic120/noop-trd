package zadatak_3_3.transport.factory;

import zadatak_3_3.transport.factory.concrete.PlaneTransport;
import zadatak_3_3.transport.factory.concrete.Transport;

public class PlaneFactory implements TransportFactory {

	@Override
	public Transport getTransport() {
		return new PlaneTransport();
	}

	

}
