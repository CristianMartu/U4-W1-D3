package Es2;

public class Call {
    private int duration;
    private String number;

    public Call(int duration, String number) {
        this.duration = duration;
        this.number = number;
    }

    public int getDuration() {
        return duration;
    }

    public String getNumber() {
        return number;
    }
}
