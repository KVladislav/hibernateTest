package hibernateTest.model.entity;

/**
 * Created with IntelliJ IDEA.
 * User: Vladislav Karpenko
 * Date: 05.06.2014
 * Time: 16:09
 */
public class Event {
    private int eventID;
    private String eventName;

    public Event(int eventID, String eventName) {
        this.eventID = eventID;
        this.eventName = eventName;
    }

    public Event() {

    }

    public int getEventID() {
        return eventID;
    }

    public void setEventID(int eventID) {
        this.eventID = eventID;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }
}
