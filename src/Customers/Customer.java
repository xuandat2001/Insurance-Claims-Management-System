package Customers;
import Claim.Claim;
import InsuranceCard.InsuranceCard;

import java.util.ArrayList;
import java.util.List;

public  abstract class Customer {
    private String idCus; //with the format c-numbers; 7 numbers
    private String fullNameCus;
    private InsuranceCard insuranceCard;
    private List<Claim> listOfClaims;

    public Customer(String idCus, String fullNameCus) {
        this.idCus = idCus;
        this.fullNameCus = fullNameCus;
        this.insuranceCard = new InsuranceCard();
        this.listOfClaims = new ArrayList<Claim>();
    }

    public Customer() {
        this.idCus = null;
        this.fullNameCus = null;
        this.insuranceCard = new InsuranceCard();
        this.listOfClaims = null;
    }

    public void setIdCus(String idCus) {
        this.idCus = idCus;
    }

    public void setFullNameCus(String fullNameCus) {
        this.fullNameCus = fullNameCus;
    }


    public String getFullNameCus() {
        return fullNameCus;
    }

    public String getIdCus() {
        return idCus;
    }

    public InsuranceCard getInsuranceCard() {
        return insuranceCard;
    }

    // Set insuranceCard for Customer
    public boolean setInsuranceCard(InsuranceCard newInsuranceCard) {
            if (insuranceCard == null) {

            this.insuranceCard = newInsuranceCard;
            newInsuranceCard.setCardHolder(this);
            return true;
        }
        System.out.println("You have already owned an insuranceCard");
        return false;
    }

    public boolean addClaim(Claim claim){
        listOfClaims.add(claim);
        return true;
    }
    @Override
    public String toString() {
        return "Customer{" +
                "idCus='" + idCus + '\'' +
                ", fullNameCus='" + fullNameCus + '\'' +
                ", insuranceCard=" + insuranceCard +
                ", listOfClaims=" + listOfClaims +
                '}';
    }
}
