import Claim.Claim;
import Customers.Customer;
import InsuranceCard.InsuranceCard;
import Interface.ProcessManage;

import java.util.HashMap;
import java.util.Map;

public class SystemInsuranceClaim implements ProcessManage {
    private Map<String, Customer> listOfCustomers;
    private Map<String, InsuranceCard> listOfInsuranceCards;
    private Map<String, Claim> listOfClaims;

    public SystemInsuranceClaim() {
        listOfCustomers = new HashMap<String,Customer>();
        listOfInsuranceCards = new HashMap<String,InsuranceCard>();
        listOfClaims = new HashMap<String,Claim>();
    }

    @Override
    public boolean add() {
        return false;
    }

    @Override
    public boolean update() {
        return false;
    }

    @Override
    public boolean delete() {
        return false;
    }

    @Override
    public void getAll() {

    }

    @Override
    public void getOne() {

    }
}
