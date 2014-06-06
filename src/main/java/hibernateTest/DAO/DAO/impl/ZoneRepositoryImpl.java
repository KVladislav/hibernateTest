package hibernateTest.DAO.DAO.impl;

import hibernateTest.DAO.ZoneRepository;
import hibernateTest.model.entity.Zone;

import java.sql.SQLException;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Vladislav Karpenko
 * Date: 06.06.2014
 * Time: 11:01
 */
public class ZoneRepositoryImpl implements ZoneRepository {
    @Override
    public void addZone(Zone zone) throws SQLException {

    }

    @Override
    public void updateZone(Zone zone) throws SQLException {

    }

    @Override
    public Zone getZoneById(int id) throws SQLException {
        return null;
    }

    @Override
    public List<Zone> getAllZones() throws SQLException {
        return null;
    }

    @Override
    public void deleteZone(Zone zone) throws SQLException {

    }
}
