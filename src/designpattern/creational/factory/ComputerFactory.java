package designpattern.creational.factory;

public class ComputerFactory {
	private static Computer computerFactory;
	
	public static Computer create(String type, String HDD, String RAM) {
		if("PC".equals(type)) {
			computerFactory = new PC(HDD, RAM);
		}
		else if("SERVER".equals(type)) {
			computerFactory = new Server(HDD, RAM);
		}
		
		return computerFactory;
	}
}
