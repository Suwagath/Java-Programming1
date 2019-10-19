public class bucky {
    private int hour = 1;
    private int minute = 2;
    private int second = 3;

    public void setTime(int hour, int minute, int second){
        hour = 4;
        minute = 5;
        second = 6;
    }

    public String toMilitarry(){
        return String.format("%02d:%02d:%02d", hour, minute, second );
    }

    public String toString(){
        return String.format("%d:%02d:%02d %s", ((hour==0||hour==12)?12:hour%12), minute, second, (hour < 12? "AM": "PM"));

    }

}
