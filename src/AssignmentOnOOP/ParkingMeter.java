package AssignmentOnOOP;

public class ParkingMeter {
    int timeLeft = 0;
    int maxTime;

    public ParkingMeter(int maxTime) {
        this.maxTime = maxTime;
    }

    public boolean add(int add){
        if (add==25&&timeLeft+30<maxTime){
            timeLeft+=30;
            return true;
        }else {
            return false;
        }
    }

    public boolean isExpired(){
        if (timeLeft==0){
            return true;
        }else{
            return false;
        }
    }
}

