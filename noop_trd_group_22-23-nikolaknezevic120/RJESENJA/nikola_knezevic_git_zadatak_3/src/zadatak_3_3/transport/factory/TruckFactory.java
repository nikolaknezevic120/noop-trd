package zadatak_3_3.transport.factory;

import zadatak_3_3.transport.factory.concrete.Transport;
import zadatak_3_3.transport.factory.concrete.TruckTransport;

public class TruckFactory implements TransportFactory{

	@Override
	public Transport getTransport() {
		return new TruckTransport();
	}

}
