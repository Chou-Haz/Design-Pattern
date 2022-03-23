public class CommandTest {
	public static void main(String[] args) {
		Light light = new Light("Living room");
		LightOnCommand lightOn = new LightOnCommand(light);
		LightOffCommand lightOff = new LightOffCommand(light);

		Ceilingfan fan = new Ceilingfan("kitchen");
		CeilingfanOnCommand fanOn = new CeilingfanOnCommand(fan);
		CeilingfanOffCommand fanOff = new CeilingfanOffCommand(fan);

		RemoteControl rc = new RemoteControl();
		rc.setCommand(lightOn,lightOff,0);
		rc.setCommand(fanOn,fanOff,1);

		rc.onButtonWasPushed(0);
		rc.onButtonWasPushed(1);
		rc.onButtonWasPushed(1);
		rc.onButtonWasPushed(1);
		rc.onButtonWasPushed(1);

		rc.offButtonWasPushed(0);
		rc.offButtonWasPushed(1);
	}
}