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
    public void addOperator (Operator operator) throws SQLException;
    public void updateOperator(Operator operator) throws SQLException;
    public Operator getOperatorById(int id) throws SQLException;
    public List<Operator> getAllOperators() throws SQLException;
    public void deleteOperator(Operator operator) throws SQLException;
}
