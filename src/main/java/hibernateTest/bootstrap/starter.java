package hibernateTest.bootstrap;

import hibernateTest.DAO.DAO.impl.EventRepositoryImpl;
import hibernateTest.DAO.DAO.impl.TicketRepositoryImpl;
import hibernateTest.DAO.DAO.impl.ZoneRepositoryImpl;
import hibernateTest.DAO.EventRepository;
import hibernateTest.DAO.TicketRepository;
import hibernateTest.DAO.ZoneRepository;
import hibernateTest.model.entity.Event;
import hibernateTest.model.entity.Ticket;
import hibernateTest.model.entity.Zone;

import java.sql.SQLException;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: Vladislav Karpenko
 * Date: 10.06.2014
 * Time: 15:13
 */
public class Starter {
    public static void main(String[] args) throws SQLException {
        TicketRepository ticketRepository = new TicketRepositoryImpl();
        ZoneRepository zoneRepository = new ZoneRepositoryImpl();
        EventRepository eventRepository = new EventRepositoryImpl();

        Event event = new Event();
        event.setEventDate(new Date());
        event.setEventName("Футбол");

        Zone zone = new Zone();
        zone.setEvent(event);
        zone.setMaxRows(20);
        zone.setMaxSeats(50);
        zone.setPrice(50);

        Ticket ticket = new Ticket();
        ticket.setRow(10);
        ticket.setSeat(15);
        ticket.setZone(zone);

        eventRepository.addEvent(event);
        zoneRepository.addZone(zone);
        ticketRepository.addTicket(ticket);

    }
}
