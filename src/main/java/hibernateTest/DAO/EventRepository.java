package hibernateTest.DAO;

import hibernateTest.model.entity.Event;

import java.sql.SQLException;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Vladislav Karpenko
 * Date: 06.06.2014
 * Time: 10:28
 */
public interface EventRepository {
    public void addEvent(Event event) throws SQLException;
    public void updateEvent(Event event) throws SQLException;
    public void getEventById(int id) throws SQLException;
    public List<Event> getAllEvents() throws SQLException;
    public void deleteEvent(Event event) throws SQLException;
}
