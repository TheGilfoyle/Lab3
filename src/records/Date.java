package records;

import enums.Month;

public record Date(int day, Month month) {
    public void print() {
        System.out.println(day + " " + month);
    }
}
