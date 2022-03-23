public class RemoteControl {
	Command[] onCommands;
	Command[] offCommands;

	public RemoteControl() {
		onCommands = new Command[7];
		offCommands = new Command[7];
		Command noCommand = new NoCommand();

		for(int i = 0;i < 7;i++) {
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
	}

	public void setCommand(Command onCommand,Command offCommand,int button) {
		onCommands[button] = onCommand;
		offCommands[button] = offCommand;
	}

	public void onButtonWasPushed(int button) {
		onCommands[button].execute();
	}

	public void offButtonWasPushed(int button) {
		offCommands[button].execute();
	}

}