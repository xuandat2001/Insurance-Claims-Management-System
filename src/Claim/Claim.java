package Claim;

import Customers.Customer;

import java.util.Date;

public class Claim {
    private String idClaim;
    private Date claimDate;
    private Customer insuredPerson;
    private Date examDate;
    private String listOfDoc;
    private Double claimAmount;
    private Status status;
    private Bank inforBank;

    public Claim(String idClaim, Date claimDate, Customer insuredPerson, Date examDate, String listOfDoc, double claimAmount, Status status, Bank inforBank) {
        this.idClaim = idClaim;
        this.claimDate = claimDate;
        this.insuredPerson = insuredPerson;
        this.examDate = examDate;
        this.listOfDoc = listOfDoc;
        this.claimAmount = claimAmount;
        this.status = status;
        this.inforBank = inforBank;
    }

    public Claim() {
        this.idClaim = null;
        this.claimDate = null;
        this.insuredPerson = null;
        this.examDate = null;
        this.listOfDoc = null;
        this.claimAmount = null;
        this.status = null;
        this.inforBank = null;
    }

    public String getIdClaim() {
        return idClaim;
    }

    @Override
    public String toString() {
        return "Claim{" +
                "idClaim='" + idClaim + '\'' +
                ", claimDate=" + claimDate +
                ", insuredPerson=" + insuredPerson +
                ", examDate=" + examDate +
                ", listOfDoc='" + listOfDoc + '\'' +
                ", claimAmount=" + claimAmount +
                ", status=" + status +
                ", inforBank=" + inforBank +
                '}';
    }
}
