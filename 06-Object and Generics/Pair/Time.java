public class Time extends Comparable{

    static public final int HOURS_PER_DAY = 24;
    static public final int MINUTES_PER_HOUR = 60;
    static public final int SECONDS_PER_MINUTE = 60;

    private int hours;
    private int minutes;
    private int seconds;

    public Time(int h, int minutes, int seconds){
        hours = h;
        this.minutes = minutes;
        this.seconds = seconds;
        normalize();
    }

    public int compareTo( Comparable o ) {

        if(!(o instanceof Time)){  
            return -1;              
        }            
                       
        Time other = (Time) o;

        if ( getTimeInSeconds() < other.getTimeInSeconds() )
            return -1;
        else if ( getTimeInSeconds() == other.getTimeInSeconds() )
            return 0;
        else
            return 1;
    }

    public int getTimeInSeconds(){
        return seconds + SECONDS_PER_MINUTE*minutes + MINUTES_PER_HOUR*SECONDS_PER_MINUTE*hours;
    }

    public int getHours(){
        return hours;
    }
    public int getMinutes(){
        return minutes;
    }
    public int getSeconds(){
        return seconds;
    }

    public boolean equals(Time other){
        return ((hours == other.hours) &&
                (minutes == other.getMinutes()) &&
                (seconds == other.getSeconds()));
    }

    public void increase(){
        seconds ++;
        normalize();
    }

    private void normalize(){
        int carry = seconds / SECONDS_PER_MINUTE;
        seconds = seconds % SECONDS_PER_MINUTE;
        minutes += carry;
        carry = minutes / MINUTES_PER_HOUR;
        minutes = minutes % MINUTES_PER_HOUR;
        hours = (hours + carry) % HOURS_PER_DAY;
    }


    public String toString(){
        return "Hours: " + hours  + " minutes: " 
        + minutes + " seconds: " + seconds;
    }
}

