import Claim.Claim;
import Customers.Customer;
import Customers.Dependent;
import Customers.PolicyHolder;
import Date.Date;
import InsuranceCard.InsuranceCard;
import Interface.ProcessManage;
import Claim.Bank;
import InsuranceCard.PolicyOwner;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

public class SystemInsuranceClaim implements ProcessManage {
    private List<Customer> policyHolderList;
    private List<Customer> dependentList;
    private List<InsuranceCard> listOfInsuranceCards;
    private List<Claim> listOfClaims;

    public SystemInsuranceClaim() {
        policyHolderList = new ArrayList<Customer>();
        dependentList = new ArrayList<Customer>();
        listOfInsuranceCards = new ArrayList<InsuranceCard>();
        listOfClaims = new ArrayList<Claim>();
    }
    public void loadDataToObject(){
        DataLoader dataLoader = new DataLoader("src/Data/PolicyHolder.txt");
        List<String[]>dataList = dataLoader.readDataFromFile();
        for (String[] data : dataList){
            String idCus = data[0];
            String nameCus = data[1];
            policyHolderList.add(new PolicyHolder(idCus,nameCus));
        }

        dataLoader = new DataLoader("src/Data/Dependent.txt");
        dataList = dataLoader.readDataFromFile();
        for (String[] data : dataList){
            String idCus = data[0];
            String nameCus = data[1];
            dependentList.add(new Dependent(idCus,nameCus));
        }

        dataLoader = new DataLoader("src/Data/insuranceCard.txt");
        dataList = dataLoader.readDataFromFile();
        for (String[] data : dataList){
            String idCard = data[0];
            listOfInsuranceCards.add(new InsuranceCard(idCard));
        }

        dataLoader = new DataLoader("src/Data/claim.txt");
        dataList = dataLoader.readDataFromFile();
        for (String[] data : dataList){
            String idClaim = data[0];
            String claimAmount = data[1];
            listOfClaims.add(new Claim(idClaim, Double.parseDouble(claimAmount)));
        }
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
