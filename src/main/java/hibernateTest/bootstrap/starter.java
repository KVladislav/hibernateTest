package hibernateTest.bootstrap;

import hibernateTest.DAO.*;
import hibernateTest.DAO.DAO.impl.*;
import hibernateTest.model.entity.*;
import hibernateTest.util.HibernateUtil;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

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
        ClientRepository clientRepository = new ClientRepositoryImpl();
        OperatorRepository operatorRepository = new OperatorRepositoryImpl();
        EventTypeRepository eventTypeRepository = new EventTypeRepositoryImpl();

        Operator operator = new Operator();
        operator.setName("User");
        operator.setDescription("Userovich");

        Client client = new Client();
        client.setName("Client");
        client.setPhone("3223322");

        EventType eventType = new EventType();
        eventType.setName("Футбол");

        Event event = new Event();
        event.setEventDate(new Date());
        event.setEventName("Черноморец - Динамо");
        event.setOperator(operator);
        event.setEventType(eventType);

        Zone zone = new Zone();
        zone.setEvent(event);
        zone.setZoneName("Зона 1");
        zone.setMaxRows(20);
        zone.setMaxSeats(50);
        zone.setPrice(50);

        Ticket ticket = new Ticket();
        ticket.setRow(10);
        ticket.setSeat(15);
        ticket.setZone(zone);
        ticket.setOperator(operator);
        ticket.setClient(client);
        ticket.setReserved(true);


        operatorRepository.addOperator(operator);
        clientRepository.addClient(client);
        eventTypeRepository.addEventType(eventType);
        eventRepository.addEvent(event);
        zoneRepository.addZone(zone);
        ticketRepository.addTicket(ticket);


        ticket = new Ticket();
        ticket.setRow(21);
        ticket.setSeat(22);
        ticket.setZone(zone);
        ticket.setOperator(operator);

        ticketRepository.addTicket(ticket);

        List<Ticket> tickets = ticketRepository.getAllTickets();

        for (int i = 0; i < tickets.size(); i++) {
            System.out.println(tickets.get(i));
        }
        HibernateUtil.shutdown();

    }
}
