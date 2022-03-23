public class RemoteControl {
	Command[] commands;

	public RemoteControl() {
		commands = new Command[3];
	}

	public void setCommand(Command command,int button) {
		commands[button] = command;
	}

	public void buttonWasPushed(int button) {
		commands[button].execute();
	}

}