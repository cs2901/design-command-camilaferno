package command;

public class Ceiling {
    SimpleRemoteControl remote = new SimpleRemoteControl();
    Fan fan = new Fan();

    public Ceiling(){}

    public void turnFan(boolean turnOn){
        if(turnOn){
            FanHighCommand fanHigh = new FanHighCommand(fan);
            System.out.println("Ceiling");
            remote.setCommand(fanHigh);
        }
        else{
            System.out.println("Ceiling");
            FanLowCommand fanLow = new FanLowCommand(fan);
            remote.setCommand(fanLow);
        }
        remote.buttonWasPressed();
    }
}
