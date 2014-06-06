package hibernateTest.DAO;

import hibernateTest.model.entity.ZoneDefaults;

import java.sql.SQLException;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Vladislav Karpenko
 * Date: 06.06.2014
 * Time: 10:49
 */
public interface ZoneDefaultsRepository {
    public void addZoneDefaults(ZoneDefaults zoneDefaults) throws SQLException;
    public void updateZoneDefaults(ZoneDefaults zoneDefaults) throws SQLException;
    public ZoneDefaults getZoneDefaultsById(int id) throws SQLException;
    public List<ZoneDefaults> getAllZoneDefaults() throws SQLException;
    public void deleteZoneDefaults(ZoneDefaults zoneDefaults) throws SQLException;

}
