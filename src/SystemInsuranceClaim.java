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
    public void Test(){
        PolicyOwner owner = new PolicyOwner("50", "RMIT University", "HCM");
        Customer cus1 = new PolicyHolder("01","Ung Xuan Dat");
        Customer cus2 = new Dependent("02","Pham Quang Huy");
        InsuranceCard card1 = new InsuranceCard("0321146326");
        InsuranceCard card2 = new InsuranceCard("0545246418");
        Claim claim1 = new Claim("99", 90.0);
        Claim claim2 = new Claim("98",  91.0);
        Bank bank = new Bank("VCB", "UNG XUAN DAT", "1019687234");
        Bank bank1 = new Bank("MB", "Pham Quang Huy", "1019687234");
        Date date = new Date();
        card1.setPolicyOwner(owner);
        card1.setExpirationDate(LocalDate.of(2025,9,11));
        claim1.setClaimDate(date.getCurrentTime());
        claim1.setExamDate( LocalDate.of(2024, 3, 2));
        claim1.setInforBank(bank);
        cus1.setInsuranceCard(card1);/// add insuranceCard
        ((PolicyHolder)cus1).addClaim(claim1);
        ((PolicyHolder)cus1).addClaim(claim2);
        cus1.displayDetailInsuranceCard();
        //((PolicyHolder)cus1).addClaim(claim2);
        System.out.println(cus1);
        System.out.println(card1);
        claim1.setCardNum();
        claim2.setCardNum();
        cus1.displayClaim();


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
