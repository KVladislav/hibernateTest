package hibernateTest.DAO.DAO.impl;

import hibernateTest.DAO.ZoneDefaultsRepository;
import hibernateTest.model.entity.ZoneDefaults;

import java.sql.SQLException;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Vladislav Karpenko
 * Date: 06.06.2014
 * Time: 11:01
 */
public class ZoneDefaultsRepositoryImpl implements ZoneDefaultsRepository {
    @Override
    public void addZoneDefaults(ZoneDefaults zoneDefaults) throws SQLException {

    }

    @Override
    public void updateZoneDefaults(ZoneDefaults zoneDefaults) throws SQLException {

    }

    @Override
    public ZoneDefaults getZoneDefaultsById(int id) throws SQLException {
        return null;
    }

    @Override
    public List<ZoneDefaults> getAllZoneDefaults() throws SQLException {
        return null;
    }

    @Override
    public void deleteZoneDefaults(ZoneDefaults zoneDefaults) throws SQLException {

    }
}
