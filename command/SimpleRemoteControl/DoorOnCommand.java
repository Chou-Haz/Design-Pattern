public class DoorOnCommand implements Command {
	Door door;

	public DoorOnCommand(Door door) {
		this.door = door;
	}

	public void execute() {
		door.openDoor();
	}
}