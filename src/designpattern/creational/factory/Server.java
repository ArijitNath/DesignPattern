package designpattern.creational.factory;

public class Server extends Computer {
	
	public Server(String HDD, String RAM) {
		this.HDD = HDD;
		this.RAM = RAM;
		
	}
	
	@Override
	public String getHDD() {
		return this.HDD;
	}

	@Override
	public String getRAM() {
		return this.RAM;
	}

}

