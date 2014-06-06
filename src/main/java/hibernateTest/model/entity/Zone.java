package hibernateTest.model.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Created with IntelliJ IDEA.
 * User: Vladislav Karpenko
 * Date: 05.06.2014
 * Time: 13:14
 */


@Entity
@Table(name = "ZONES")
public class Zone {
    private int id;
    private ZoneSettings zoneSettings;
    private Event event;
    private int price;

    public Zone() {
    }

    @ManyToOne
    @JoinColumn(name = "EVENTS_ID")
    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    @ManyToOne
    @JoinColumn(name = "ZONESETTINGS_ID")
    public ZoneSettings getZoneSettings() {
        return zoneSettings;
    }

    public void setZoneSettings(ZoneSettings zoneSettings) {
        this.zoneSettings = zoneSettings;
    }

    @Column(name = "Price")
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
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
}
