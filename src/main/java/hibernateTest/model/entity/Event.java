package hibernateTest.model.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: Vladislav Karpenko
 * Date: 05.06.2014
 * Time: 16:09
 */

@Entity
@Table(name = "EVENTS")
public class Event {
    private int id;
    private EventType eventType;
    private String eventName;
    private Date eventDate;
    private Operator operator;

    public Event() {

    }

    @Column(name = "EVENTS")
    public Date getEventDate() {
        return eventDate;
    }

    public void setEventDate(Date eventDate) {
        this.eventDate = eventDate;
    }

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "EventName")
    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }
}
