package Es2;

import java.util.Arrays;

public class Sim {
    private String number;
    private double credit;
    private Call[] lastFiveCalls;

    public Sim(String number) {
        this.number = number;
        this.credit = 0;
        this.lastFiveCalls = new Call[5];
    }

    public void printDataSim() {
        System.out.println("Number: " + this.number);
        System.out.println("Credit: " + this.credit);
        System.out.println("Call: " + Arrays.toString(this.lastFiveCalls));
    }
}
