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
    private ZoneDefaults zoneDefaults;
    private Event event;
    private int price;
    private String zoneName;
    private int maxRows;
    private int maxSeats;

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
    @JoinColumn(name = "ZONEDEFAULTS_ID")
    public ZoneDefaults getZoneDefaults() {
        return zoneDefaults;
    }

    public void setZoneDefaults(ZoneDefaults zoneDefaults) {
        this.zoneDefaults = zoneDefaults;
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

    @Column(name = "MaxRows")
    public int getMaxRows() {
        return maxRows;
    }

    public void setMaxRows(int maxRows) {
        this.maxRows = maxRows;
    }

    @Column(name = "MaxSeats")
    public int getMaxSeats() {
        return maxSeats;
    }

    public void setMaxSeats(int maxSeats) {
        this.maxSeats = maxSeats;
    }

    @Column(name = "ZoneName")
    public String getZoneName() {
        return zoneName;
    }

    public void setZoneName(String zoneName) {
        this.zoneName = zoneName;
    }
}
