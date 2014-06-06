package hibernateTest.DAO.DAO.impl;

import hibernateTest.DAO.TicketRepository;
import hibernateTest.model.entity.Ticket;

import java.sql.SQLException;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Vladislav Karpenko
 * Date: 06.06.2014
 * Time: 11:00
 */
public class TicketRepositoryImpl implements TicketRepository {
    @Override
    public void addTicket(Ticket ticket) throws SQLException {

    }

    @Override
    public void updateTicket(Ticket ticket) throws SQLException {

    }

    @Override
    public Ticket getTicketById(int id) throws SQLException {
        return null;
    }

    @Override
    public List<Ticket> getAllTickets() throws SQLException {
        return null;
    }

    @Override
    public void deleteTicket(Ticket ticket) throws SQLException {

    }
}
