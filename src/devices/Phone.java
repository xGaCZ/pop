package devices;
public class Phone {
    public class phone extends Device  {
        @Override
    public String toString(){return "";}
    public boolean turnOn() {
        System.out.println("Turn On");
        return true;
    }
}}