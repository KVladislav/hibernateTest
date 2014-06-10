package hibernateTest.DAO.DAO.impl;

import hibernateTest.DAO.ZoneDefaultsRepository;
import hibernateTest.model.entity.ZoneDefaults;
import hibernateTest.util.HibernateUtil;
import org.hibernate.Session;

import javax.swing.*;
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
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(zoneDefaults);
            session.getTransaction().commit();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error I/O", JOptionPane.OK_OPTION);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
    }

    @Override
    public void updateZoneDefaults(ZoneDefaults zoneDefaults) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.update(zoneDefaults);
            session.getTransaction().commit();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error I/O", JOptionPane.OK_OPTION);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }

    }

    @Override
    public ZoneDefaults getZoneDefaultsById(int id) {
        Session session = null;
        ZoneDefaults zoneDefaults = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            zoneDefaults = (ZoneDefaults) session.load(ZoneDefaults.class, id);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error I/O", JOptionPane.OK_OPTION);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return zoneDefaults;
    }

    @Override
    public List<ZoneDefaults> getAllZoneDefaults() throws SQLException {
        Session session = null;
        List<ZoneDefaults> zoneDefaults = null;//new ArrayList<Event>();
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            zoneDefaults = session.createCriteria(ZoneDefaults.class).list();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error I/O", JOptionPane.OK_OPTION);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return zoneDefaults;
    }

    @Override
    public void deleteZoneDefaults(ZoneDefaults zoneDefaults) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(zoneDefaults);
            session.getTransaction().commit();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error I/O", JOptionPane.OK_OPTION);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }

    }
}