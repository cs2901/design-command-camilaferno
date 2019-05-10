package command;

public class LivingRoom {
    SimpleRemoteControl remote = new SimpleRemoteControl();
    Light light = new Light();

    public LivingRoom(){}

    public void turnLights(boolean turnOn){
        if(turnOn){
            LightOnCommand lightOn = new LightOnCommand(light);
            System.out.println("LivingRoom");
            remote.setCommand(lightOn);
        }
        else{
            System.out.println("LivingRoom");
            LightOffCommand lightOff = new LightOffCommand(light);
            remote.setCommand(lightOff);
        }
        remote.buttonWasPressed();
    }
}
