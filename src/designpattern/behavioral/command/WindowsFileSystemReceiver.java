package designpattern.behavioral.command;

public class WindowsFileSystemReceiver implements FileSystemReceiver {

	@Override
	public void openFile() {
		System.out.println("Open file in Windows");
	}

	@Override
	public void closeFile() {
		System.out.println("Close file in Windows");
	}

}
