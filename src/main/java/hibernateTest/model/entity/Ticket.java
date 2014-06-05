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
@Table(name="Ticket")
public class Ticket {
    private int ticketID;
    private Zone zone;
    private int row;
    private int seat;
    private boolean isReserved;
    private Client client;

    public Ticket(int ticketID, Zone zone, int row, int seat, boolean isReserved, Client client) {
        this.ticketID = ticketID;
        this.zone = zone;
        this.row = row;
        this.seat = seat;
        this.isReserved = isReserved;
        this.client = client;
    }

    public Ticket() {
    }

    @Column(name = "Row")
    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    @Column (name = "Seat")
    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }


    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "ticketID")
    public int getTicketID() {
        return ticketID;
    }

    public void setTicketID(int ticketID) {
        this.ticketID = ticketID;
    }

    @Column(name = "Zone")
    public Zone getZone() {
        return zone;
    }

    public void setZone(Zone zone) {
        this.zone = zone;
    }

    @Column(name = "isReserved")
    public boolean isReserved() {
        return isReserved;
    }

    public void setReserved(boolean isReserved) {
        this.isReserved = isReserved;
    }

    @Column(name = "Client")
    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
