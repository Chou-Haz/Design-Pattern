public class SimpleCommandTest {
	public static void main(String[] args) {
		Light light = new Light();
		Door door = new Door();
		
		LightOnCommand lightOn = new LightOnCommand(light);
		LightOffCommand lightOff = new LightOffCommand(light);
		DoorOnCommand doorOn = new DoorOnCommand(door);

		RemoteControl remoteControl = new RemoteControl();

		remoteControl.setCommand(lightOn);
		remoteControl.buttonWasPushed();

		remoteControl.setCommand(lightOff);
		remoteControl.buttonWasPushed();

		remoteControl.setCommand(doorOn);
		remoteControl.buttonWasPushed();
	}
}