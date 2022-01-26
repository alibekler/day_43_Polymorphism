package AssignmentOnOOP;

public class GasTank {

    double amount=0;
    double capacity;

    public GasTank(double capacity) {
        this.capacity = capacity;
    }

    public void addGas(double add){
        if (amount+add>capacity){
            amount=capacity;
        }else{
            amount+=add;
        }
    }

    public void useGas(double use){
        if (amount-use<0){
            amount=0;
        }else {
            amount -= use;
        }
    }

    public boolean isEmpty(){
        if (amount<0.1){
            return true;
        }else {
            return false;
        }
    }

    public boolean isFull(){
        if (amount>capacity-0.1){
            return true;
        }else {
            return false;
        }
    }

    public double getGasLevel(){
        return amount;
    }

    public double fillUp(){
        double diff = capacity-amount;
        amount=capacity;
        return diff;
    }


}

