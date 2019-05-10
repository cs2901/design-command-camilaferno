package command;

public class Garage {
    SimpleRemoteControl remote = new SimpleRemoteControl();
    Door door = new Door();

    public Garage(){}

    public void openDoor(boolean open){
        if(open){
            DoorOpenCommand doorOpen = new DoorOpenCommand(door);
            System.out.println("Garage");
            remote.setCommand(doorOpen);
        }
        else{
            System.out.println("Garage");
            DoorCloseCommand doorClose = new DoorCloseCommand(door);
            remote.setCommand(doorClose);
        }
        remote.buttonWasPressed();
    }
}
