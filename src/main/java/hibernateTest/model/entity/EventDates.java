package hibernateTest.model.entity;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: Vladislav Karpenko
 * Date: 05.06.2014
 * Time: 16:11
 */
public class EventDates {
    private Event event;
    private Date date;

    public EventDates() {
    }

    public EventDates(Event event, Date date) {
        this.event = event;
        this.date = date;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
