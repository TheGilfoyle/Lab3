package etc;

public class ScientificWork {
    private static double time;
    public static boolean enoughTime(){
        if (time > 5) {
            return true;
        }
        else {return false;}
    }
}
