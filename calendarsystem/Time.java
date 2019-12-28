package calendarsystem;
public class Time {
    int hours = 0;
    int minutes = 0;
    int seconds = 0;
    private int hoursInDay = 0;
    public void Time(int newHours, int newMinutes, int newSeconds, int newHoursInDay){
        hours = newHours;
        minutes = newMinutes;
        seconds = newSeconds;
        hoursInDay = newHoursInDay;
    }
    public boolean increment(){
        boolean result = false;
        if(++seconds > 59){
            seconds = 0;
            if(++minutes > 59){
                minutes = 0;
                if(++hours >= hoursInDay){
                    hours = 0;
                    result = true;
                }
            }
        }
        return result;
    }
}
