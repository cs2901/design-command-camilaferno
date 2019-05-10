package command;

public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();

        Stereo stereo = new Stereo();
        StereoOnCommand stereoOn = new StereoOnCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);

        remote.setCommand(stereoOn);
        remote.buttonWasPressed();

        remote.setCommand(stereoOff);
        remote.buttonWasPressed();

        LivingRoom livingRoom = new LivingRoom();
        livingRoom.turnLights(true);
        livingRoom.turnLights(false);

        KitchenRoom kitchenRoom = new KitchenRoom();
        kitchenRoom.turnLights(true);
        kitchenRoom.turnLights(false);

        Ceiling ceiling = new Ceiling();
        ceiling.turnFan(true);
        ceiling.turnFan(false);

        Garage garage = new Garage();
        garage.openDoor(true);
        garage.openDoor(false);

    }
}
