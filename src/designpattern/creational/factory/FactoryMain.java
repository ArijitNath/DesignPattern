package designpattern.creational.factory;

public class FactoryMain {

	public static void main(String[] args) {
		Computer pc = ComputerFactory.create("PC", "1TB", "16GB");
		Computer server = ComputerFactory.create("SERVER", "10TB", "96GB");
		
		System.out.println(pc);
		System.out.println(server);
	}
}
