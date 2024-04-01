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

    public Customer(String idCus, String fullNameCus, InsuranceCard insuranceCard) {
        this.idCus = idCus;
        this.fullNameCus = fullNameCus;
        this.insuranceCard = insuranceCard;
        this.listOfClaims = new ArrayList<Claim>();
    }

    public Customer() {
        this.idCus = null;
        this.fullNameCus = null;
        this.insuranceCard = null;
        this.listOfClaims = null;
    }

    public String getIdCus() {
        return idCus;
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
