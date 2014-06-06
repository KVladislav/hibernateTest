package hibernateTest.DAO;

import hibernateTest.model.entity.Zone;

import java.sql.SQLException;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Vladislav Karpenko
 * Date: 06.06.2014
 * Time: 10:28
 */
public interface ZoneRepository {
    public void addZone(Zone zone) throws SQLException;
    public void updateZone(Zone zone) throws SQLException;
    public Zone getZoneById(int id) throws SQLException;
    public List<Zone> getAllZones() throws SQLException;
    public void deleteZone(Zone zone) throws SQLException;

}
