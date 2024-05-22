package Es2;

public class Call {
    private int duration;
    private int number;

    public Call(int duration, int number) {
        this.duration = duration;
        this.number = number;
    }

    public int getDuration() {
        return duration;
    }

    public int getNumber() {
        return number;
    }
}
