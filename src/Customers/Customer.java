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
        this.listOfClaims = new ArrayList<Claim>();
    }

    public Customer() {
        this.idCus = null;
        this.fullNameCus = null;
        this.insuranceCard = null;
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
    public boolean isOwnedInsuranceCard(){
        return this.getInsuranceCard() != null;
    }



    // Set insuranceCard for Customer
    public boolean setInsuranceCard(InsuranceCard newInsuranceCard) {
            if (!isOwnedInsuranceCard() && newInsuranceCard.getCardHolder() == null) {
                this.insuranceCard = newInsuranceCard;
                newInsuranceCard.setCardHolder(this);
                return true;
            }
            System.out.println("here");
            return false;

    }



    public void displayDetailInsuranceCard(){
        System.out.println(insuranceCard);
    }

    public boolean addClaim(Claim claim){
        if (listOfClaims.contains(claim)){
            return false;
        }
        listOfClaims.add(claim);
        claim.setInsuredPerson(this);
        return true;
    }

    public boolean deleteClaim(Claim claim){
        if (listOfClaims.contains(claim)){
            listOfClaims.remove(claim);
            claim.setInsuredPerson(null);
            return true;
        }
        return false;
    }

    public void displayClaim(){
        for (Claim claim : listOfClaims){
            System.out.println(claim);
        }
    }
    @Override
    public String toString() {
        return "Customer{" +
                "idCus='" + idCus + '\'' +
                ", fullNameCus='" + fullNameCus + '\'' +
                '}';
    }
}
