package designpattern.behavioral.chainofresponsibility;

public class PositiveNumberProcessor implements NumberProcessor {

	private NumberProcessor nextNumberProcessor;
	
	@Override
	public void execute(Number number) {
		if(number.getNum() > 0) {
			System.out.println(number.getNum() + " is positive!");
		}
		else {
			nextNumberProcessor.execute(number);
		}
	}

	@Override
	public void setNextprocessor(NumberProcessor nextNumberProcessor) {
		this.nextNumberProcessor = nextNumberProcessor;
	}
}
