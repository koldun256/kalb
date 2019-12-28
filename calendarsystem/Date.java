package calendarsystem;
public class Date {
    int year = 0;
    int monthNumber;
    Month month;
    int day = 0;
    String weekDay;
    int weekDayNumber;
    Time time;
    CalendarSystem calendarSystem;
    public void MyDate(int newYear, int newMonth, int newDay, Time newTime, int newWeekDay, CalendarSystem currentCalendarSystem){
        calendarSystem = currentCalendarSystem;

        year    = newYear;
        monthNumber = newMonth;
        month   = calendarSystem.months[monthNumber];
        day     = newDay;
        time    = newTime;
        weekDayNumber = newWeekDay;
        weekDay = currentCalendarSystem.week[newWeekDay];

    }
    public String toString(){
        return ""+time.hours+":"+time.minutes+":"+time.seconds+" "+year+" "+month.name+" "+day+" "+weekDay;
    }
    public void increment(){
        if(time.increment()){
            if(++day >= month.days){
                day = 0;
                if(++monthNumber >= calendarSystem.months.length){
                    monthNumber = 0;
                    year++;
                }
                month = calendarSystem.months[monthNumber];
            }
            if(++weekDayNumber >= calendarSystem.week.length){
                weekDayNumber = 0;
            }
            weekDay = calendarSystem.week[weekDayNumber];
        }
    }
}
