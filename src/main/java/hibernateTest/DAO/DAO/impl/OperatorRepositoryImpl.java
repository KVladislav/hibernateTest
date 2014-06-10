package hibernateTest.DAO.DAO.impl;

import hibernateTest.DAO.OperatorRepository;
import hibernateTest.model.entity.Operator;

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
    public void addOperator(Operator eventType) throws SQLException {

    }

    @Override
    public void updateOperator(Operator eventType) throws SQLException {

    }

    @Override
    public Operator getOperatorById(int id) throws SQLException {
        return null;
    }

    @Override
    public List<Operator> getAllOperators() throws SQLException {
        return null;
    }

    @Override
    public void deleteOperator(Operator eventType) throws SQLException {

    }
}
