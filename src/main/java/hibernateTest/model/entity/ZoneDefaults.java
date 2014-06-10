package hibernateTest.model.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Created with IntelliJ IDEA.
 * User: Vladislav Karpenko
 * Date: 06.06.2014
 * Time: 10:40
 */

@Entity
@Table(name = "ZONEDEFAULTS")
public class ZoneDefaults {
    private int id;
    private String zoneName;
    private int maxRows;
    private int maxSeats;

    public ZoneDefaults() {
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

    @Override
    public String toString() {
        return "ZoneDefaults{" +
                "id=" + id +
                ", zoneName='" + zoneName + '\'' +
                ", maxRows=" + maxRows +
                ", maxSeats=" + maxSeats +
                '}';
    }
}
