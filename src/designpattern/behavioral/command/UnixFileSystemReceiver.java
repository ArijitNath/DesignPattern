package designpattern.behavioral.command;

public class UnixFileSystemReceiver implements FileSystemReceiver {

	@Override
	public void openFile() {
		System.out.println("Open file in Unix");
	}

	@Override
	public void closeFile() {
		System.out.println("Close file in Unix");
	}

}
