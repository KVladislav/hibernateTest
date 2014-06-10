package hibernateTest.DAO.DAO.impl;

import hibernateTest.DAO.EventTypeRepository;
import hibernateTest.model.entity.EventType;

import java.sql.SQLException;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Vladislav Karpenko
 * Date: 07.06.2014
 * Time: 22:14
 */
public class EventTypeRepositoryImpl implements EventTypeRepository {
    @Override
    public void addEventType(EventType eventType) throws SQLException {

    }

    @Override
    public void updateEventType(EventType eventType) throws SQLException {

    }

    @Override
    public EventType getEventTypeById(int id) throws SQLException {
        return null;
    }

    @Override
    public List<EventType> getAllEventTypes() throws SQLException {
        return null;
    }

    @Override
    public void deleteEventType(EventType eventType) throws SQLException {

    }
}
