package hibernateTest.DAO.DAO.impl;

import hibernateTest.DAO.OperatorRepository;
import hibernateTest.model.entity.Operator;
import hibernateTest.util.HibernateUtil;
import org.hibernate.Session;

import javax.swing.*;
import java.sql.SQLException;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Vladislav Karpenko
 * Date: 07.06.2014
 * Time: 22:14
 */
public class OperatorRepositoryImpl implements OperatorRepository {

    @Override
    public void addOperator(Operator operator) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(operator);
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
    public void updateOperator(Operator operator) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.update(operator);
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
    public Operator getOperatorById(int id) throws SQLException {
        Session session = null;
        Operator operator = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            operator = (Operator) session.load(Operator.class, id);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error I/O", JOptionPane.OK_OPTION);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return operator;
    }

    @Override
    public List<Operator> getAllOperators() throws SQLException {
        Session session = null;
        List<Operator> operators = null;//new ArrayList<Event>();
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            operators = session.createCriteria(Operator.class).list();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error I/O", JOptionPane.OK_OPTION);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return operators;
    }

    @Override
    public void deleteOperator(Operator operator) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(operator);
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