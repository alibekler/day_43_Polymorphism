package AssignmentOnOOP;

public class Value {

    private int val=0;
    public boolean modified;
    public Value() {
    }

    public Value(int val) {
        this.val = val;
    }

    public void setVal(int val) {
        this.val = val;
        modified=true;
    }

    public boolean wasModified(){
        return modified;
    }
}