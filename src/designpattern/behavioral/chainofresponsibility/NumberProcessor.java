package designpattern.behavioral.chainofresponsibility;

public interface NumberProcessor {
	void execute(Number number);
	void setNextprocessor(NumberProcessor nextNumberProcessor);
}
