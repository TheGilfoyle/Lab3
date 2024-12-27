package etc;

import people.Person;

public class ScientificWork {
    private double time = 10;
    private boolean success = false;
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

    public void isItMine(Person person) {
        person.setScienceLevel();
    }

    public void setSuccess(boolean enoughTime) {
        this.success = success;
    }
    public boolean getSuccess() {
        return success;
    }
}
