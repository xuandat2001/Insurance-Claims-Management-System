package Customers;
import Claim.Claim;
import InsuranceCard.InsuranceCard;

import java.util.ArrayList;
import java.util.List;
/**
 * @author <Ung Xuan Dat - s3932156>
 */
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

    // Set insuranceCard for Customer
    public boolean setInsuranceCard(InsuranceCard newInsuranceCard) {
        this.insuranceCard = newInsuranceCard;
        if (newInsuranceCard != null){
            newInsuranceCard.setCardHolder(this);
        }//set back CardHolder of newInsuranceCard
        return true;
    }


    /**
     * add the claim to the customer's claimList
     * <p>
     * Given a claim, assign the current customer as its insuredPerson.
     * If the assignment is successful, return true,
     * otherwise, return false
     * </p>
     * @param claim the claim to add
     * @return true if the assignment is successful, otherwise, return false
     */
    public boolean addClaim(Claim claim){
        if (listOfClaims.contains(claim) && claim.getInsuredPerson() != null && this.getInsuranceCard() == null){
             /*
                three conditions below must satisfy
                the ClaimList must not contain claim
                the InsuredPerson of claim must be null
                the InsuranceCard of this customer must not Null
            */
            System.out.println("Something Wrong");
            return false;
        }
        listOfClaims.add(claim);
        claim.setInsuredPerson(this);
        return true;
    }



    /**
     * delete the claim from the customer's claimList
     * <p>
     * Given a claim, assign its insuredPerson as null.
     * If the assignment is successful, return true,
     * otherwise, return false
     * </p>
     * @param claim the claim to delete
     * @return true if the assignment is successful, otherwise, return false
     */
    public boolean deleteClaim(Claim claim){
        if (listOfClaims.contains(claim)){
            /*
                the condition below must satisfy
                the ClaimList must contain the claim
            */
            listOfClaims.remove(claim);
            claim.setInsuredPerson(null);
            return true;
        }
        return false;
    }


    //Display all Claim of Customer
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
                ", insuranceCard=" + insuranceCard.getCardNum() +
                '}';
    }
}
