package AssignmentOnOOP;

public class TV {
    public static void main(String[] args) {
        TV obj = new TV();

        obj.getBrand();
        obj.turnOn();
        obj.turnOn();
        obj.setVolumeLevel(5);
        obj.volumeUp();
        System.out.println(obj.getVolumeLevel());
        obj.volumeUp();
        obj.volumeUp();
        System.out.println(obj.getChannel());
        obj.turnOff();
        obj.turnOff();

    }

   private int channel=1;
   private int volumeLevel=1;
   private boolean on = false;
   private String brand= "undefined";

    public TV() {
        System.out.println("Creating TV object using no Args constructor");
    }

    public TV(String brand) {
        this.brand = brand;
        System.out.println("Creating TV object using 1arg constructor");
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public int getVolumeLevel() {
        return volumeLevel;
    }

    public void setVolumeLevel(int volumeLevel) {
        this.volumeLevel = volumeLevel;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void channelUp(){
        if (isOn()&&channel+1<120){
            channel++;
        }else {
            System.out.println("ERROR: TV is either OFF or invalid Volume level");
        }
    }

    public void channelDown(){
       if (isOn()&&channel-1<0){
           channel--;
       }else{
           System.out.println("ERROR: TV is either OFF or invalid Volume level");
       }
    }


    public void volumeUp(){
        if (isOn() && volumeLevel+1<8){
            volumeLevel++;
        }else {
            System.out.println("ERROR: TV is either OFF or invalid Volume level");
        }
    }

    public void volumeDown(){
        if (isOn() && volumeLevel-1>0){
            volumeLevel--;
        }else {
            System.out.println("ERROR: TV is either OFF or invalid Volume level");
        }
    }

    public boolean isOn(){
       return on;
    }

    public boolean turnOn(){
        if (on==true){
            System.out.println("TV is already ON");
        }
        return on=true;
    }

    public boolean turnOff(){
        if (on==false){
            System.out.println("TV is already OFF");
        }
        return on=false;
    }


}
