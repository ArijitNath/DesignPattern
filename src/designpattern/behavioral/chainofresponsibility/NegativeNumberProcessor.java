package designpattern.behavioral.chainofresponsibility;

public class NegativeNumberProcessor implements NumberProcessor {

	private NumberProcessor nextNumberPorcessor;
	
	@Override
	public void execute(Number number) {
		if(number.getNum() < 0) {
			System.out.println(number.getNum() + " is negative");
		}
		else {
			nextNumberPorcessor.execute(number);
		}
	}

	@Override
	public void setNextprocessor(NumberProcessor nextNumberProcessor) {
		this.nextNumberPorcessor = nextNumberProcessor;
	}

}
