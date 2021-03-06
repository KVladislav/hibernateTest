package hibernateTest.DAO;

import hibernateTest.model.entity.Client;

import java.sql.SQLException;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Vladislav Karpenko
 * Date: 06.06.2014
 * Time: 10:27
 */
public interface ClientRepository {
    public void addClient(Client client)  throws SQLException;
    public void updateClient(Client client)  throws SQLException;
    public Client getClientById(int id)  throws SQLException;
    public Client getClientByPhone(String phone)  throws SQLException;;
    public List<Client> getAllClients() throws SQLException;
    public void deleteClient(Client client) throws SQLException;
}
