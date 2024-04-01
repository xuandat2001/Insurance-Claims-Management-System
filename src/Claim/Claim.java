package Claim;

import Customers.Customer;
import Customers.Dependent;
import Customers.PolicyHolder;

import java.util.Date;

public class Claim {
    private String idClaim;
    private Date claimDate;
    private Object insuredPerson;
    private Date examDate;
    private String listOfDoc;
    private Double claimAmount;
    private Status status;
    private Bank inforBank;

    public Claim(String idClaim, Date claimDate, Object insuredPerson, Date examDate, String listOfDoc, double claimAmount, Status status, Bank inforBank) {
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

    //set Status for claim
    public void setStatus(Status status) {
        this.status = status;
    }

    //set insurePerson is PolicyHolder or Dependent
    public boolean setInsuredPerson(Object obj) {
        if (insuredPerson == null){
            if (obj instanceof PolicyHolder){
                this.insuredPerson = obj;
            }
            else if(obj instanceof Dependent){
                this.insuredPerson = obj;
            }
            return true;
        }
        else{
            System.out.println("This claim has already been had an insured person");
            return false;
        }
    }


    public boolean setClaimDate(Date newClaimDate) {
        if (claimDate == null) {
            this.claimDate = newClaimDate;
            return true;
        }
        System.out.println("Claim Date has already been set");
        return false;
    }

    public boolean setExamDate(Date NewExamDate) {
        if (claimDate == null){
            this.examDate = NewExamDate;
            return true;
        }
        System.out.println("Exam Date has already been set");
        return false;
    }

    //Set Bank Information for claim
    public boolean setInforBank(Bank bank) {
        if (inforBank == null){
            this.inforBank = bank;
            return true;
        }
        return false;
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
