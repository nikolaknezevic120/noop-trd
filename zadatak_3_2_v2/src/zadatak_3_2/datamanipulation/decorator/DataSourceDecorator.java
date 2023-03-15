package zadatak_3_2.datamanipulation.decorator;

import zadatak_3_2.datamanipulation.DataSource;

public abstract class DataSourceDecorator implements DataSource{
	
	protected final DataSource dataSource;
	
	protected DataSourceDecorator(DataSource dataSource) {
	
		this.dataSource = dataSource;
		
	}
	 
}