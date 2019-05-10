package command;

public class KitchenRoom {
    SimpleRemoteControl remote = new SimpleRemoteControl();
    Light light = new Light();

    public KitchenRoom(){}

    public void turnLights(boolean turnOn){
        if(turnOn){
            LightOnCommand lightOn = new LightOnCommand(light);
            System.out.println("KitchenRoom");
            remote.setCommand(lightOn);
        }
        else{
            System.out.println("KitchenRoom");
            LightOffCommand lightOff = new LightOffCommand(light);
            remote.setCommand(lightOff);
        }
        remote.buttonWasPressed();
    }
}
