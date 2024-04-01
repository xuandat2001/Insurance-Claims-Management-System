package Date;

import java.time.LocalDate;

public class Date {
    private LocalDate date;

    public Date() {
        this.date = LocalDate.now();
    }
    // get Current Date
    public LocalDate getCurrentTime(){

        return  date;

    }
    //Set Current Date
    public void setDate(LocalDate newDate) {
        this.date = newDate;
    }
}
