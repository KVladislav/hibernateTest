package hibernateTest.model.entity;

/**
 * Created with IntelliJ IDEA.
 * User: Vladislav Karpenko
 * Date: 05.06.2014
 * Time: 13:14
 */


public class Zone {
    private int zoneID;
    private String zoneName;
    private int maxRows;
    private int maxSeats;

    public Zone(int zoneID, String zoneName, int maxRows, int maxSeats) {
        this.zoneID = zoneID;
        this.zoneName = zoneName;
        this.maxRows = maxRows;
        this.maxSeats = maxSeats;
    }

    public Zone() {
    }

    public int getMaxRows() {
        return maxRows;
    }

    public void setMaxRows(int maxRows) {
        this.maxRows = maxRows;
    }

    public int getMaxSeats() {
        return maxSeats;
    }

    public void setMaxSeats(int maxSeats) {
        this.maxSeats = maxSeats;
    }

    public int getZoneID() {
        return zoneID;
    }

    public void setZoneID(int zoneID) {
        this.zoneID = zoneID;
    }

    public String getZoneName() {
        return zoneName;
    }

    public void setZoneName(String zoneName) {
        this.zoneName = zoneName;
    }
}
