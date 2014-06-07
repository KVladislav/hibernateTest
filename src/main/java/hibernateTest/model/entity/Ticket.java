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
@Table(name = "TICKETS")
public class Ticket {
    private int id;
    private Zone zone;
    private int row;
    private int seat;
    private boolean isReserved;
    private Client client;
    private Operator operator;

    public Ticket() {
    }

    @ManyToOne
    @JoinColumn(name = "OPERATORS_ID")
    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    @ManyToOne
    @JoinColumn(name = "ZONES_ID")
    public Zone getZone() {
        return zone;
    }

    @ManyToOne
    @JoinColumn(name = "CLIENTS_ID")
    public Client getClient() {
        return client;
    }


    @Column(name = "ROW")
    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    @Column(name = "SEAT")
    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
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

    @Column(name = "ISRESERVED")
    public boolean isReserved() {
        return isReserved;
    }

    public void setReserved(boolean isReserved) {
        this.isReserved = isReserved;
    }

    public void setZone(Zone zone) {
        this.zone = zone;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
