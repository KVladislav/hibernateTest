package hibernateTest.DAO;

import hibernateTest.model.entity.EventType;

import java.sql.SQLException;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Vladislav Karpenko
 * Date: 07.06.2014
 * Time: 22:09
 */
public interface EventTypeRepository {
    public void addEventType (EventType eventType) throws SQLException;
    public void updateEventType(EventType eventType) throws SQLException;
    public EventType getEventTypeById(int id) throws SQLException;
    public List<EventType> getAllEventTypes() throws SQLException;
    public void deleteEventType(EventType eventType) throws SQLException;
}
