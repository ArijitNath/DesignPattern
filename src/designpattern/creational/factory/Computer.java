package designpattern.creational.factory;

public abstract class Computer {
	
	protected String HDD;
	protected String RAM;
	
	public abstract String getHDD();
	public abstract String getRAM();
	@Override
	public String toString() {
		return "Computer [HDD=" + getHDD() + ", RAM=" + getRAM() + "]";
	}
}
