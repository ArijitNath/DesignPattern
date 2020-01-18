package designpattern.behavioral.command;

public class CommandMain {

	public static void main(String[] args) {
		FileSystemReceiver f1 = new WindowsFileSystemReceiver();
		FileSystemReceiver f2 = new UnixFileSystemReceiver();
		Command open = new OpenFileCommand(f1);
		Command close = new CloseFileCommand(f2);
		
		CommandInvoker c1 = new CommandInvoker(open);
		CommandInvoker c2 = new CommandInvoker(close);
		
		c1.execute();
		c2.execute();
	}
}
