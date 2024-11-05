public class Time
{
    private int seconds;
    
    public int getSeconds()
    {
        return seconds;
    }

    public void setSeconds(int seconds)
    {
        this.seconds = seconds;
    }
    
    public Time()
    {
        this.seconds = 0;
    }
    
    public Time(int seconds)
    {
        this.seconds = seconds;
    }
    
    public String toString()
    {
        int hours = (seconds / 3600) % 24;
        seconds = seconds % 3600;
        int minutes = seconds / 60;
        seconds = seconds % 60;
        String str_hours, str_minutes, str_seconds;
        if(hours<10)
            str_hours = "0" + hours;
        else
            str_hours = "" + hours;
        if(minutes<10)
            str_minutes = "0" + minutes;
        else
            str_minutes = "" + minutes;
        if(seconds<10)
            str_seconds = "0" + seconds;
        else
            str_seconds = "" + seconds;
        return str_hours + ":" + str_minutes + ":" + str_seconds;
    }
}
