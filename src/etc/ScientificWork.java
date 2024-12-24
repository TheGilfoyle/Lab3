package etc;

public class ScientificWork {
    private double time = 10;

    public boolean enoughTime() {
        if (time > 5) {
            return true;
        } else {
            return false;
        }
    }

    public void setTime(double time) {
        this.time = time;
    }

    public double getTime() {
        return time;
    }

    public void isItGoing() {
    }
}
