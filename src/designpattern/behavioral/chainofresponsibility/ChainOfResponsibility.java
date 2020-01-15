package designpattern.behavioral.chainofresponsibility;

public class ChainOfResponsibility {

	public static void main(String[] args) {
		NumberProcessor negativeProcessor = new NegativeNumberProcessor();
		NumberProcessor zeroProcessor = new ZeroNumberProcessor();
		NumberProcessor positiveProcessor = new PositiveNumberProcessor();
		
		negativeProcessor.setNextprocessor(zeroProcessor);
		zeroProcessor.setNextprocessor(positiveProcessor);
		
		negativeProcessor.execute(new Number(-50));
		negativeProcessor.execute(new Number(50));
		negativeProcessor.execute(new Number(50));
		negativeProcessor.execute(new Number(-1));
		negativeProcessor.execute(new Number(0));		
	}
}
