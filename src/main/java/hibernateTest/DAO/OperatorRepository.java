package hibernateTest.DAO;

import hibernateTest.model.entity.Operator;

import java.sql.SQLException;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Vladislav Karpenko
 * Date: 07.06.2014
 * Time: 22:09
 */
public interface OperatorRepository {
    public void addOperator (Operator eventType) throws SQLException;
    public void updateOperator(Operator eventType) throws SQLException;
    public Operator getOperatorById(int id) throws SQLException;
    public List<Operator> getAllOperators() throws SQLException;
    public void deleteOperator(Operator eventType) throws SQLException;
}
