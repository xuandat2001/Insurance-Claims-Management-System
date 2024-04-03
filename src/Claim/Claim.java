package Claim;

import Customers.Customer;
import Customers.Dependent;
import Customers.PolicyHolder;

import java.time.LocalDate;
import java.util.Date;

public class Claim {
    private String idClaim;
    private LocalDate claimDate;
    private Customer insuredPerson;
    private LocalDate examDate;
    private String listOfDoc;
    private Double claimAmount;
    private Status status;
    private Bank inforBank;

    public Claim(String idClaim, String listOfDoc, double claimAmount) {
        this.idClaim = idClaim;
        this.claimDate = null;
        this.insuredPerson = new Customer() {};
        this.examDate = null;
        this.listOfDoc = listOfDoc;
        this.claimAmount = claimAmount;
        this.status = Status.PROCESSING;
        this.inforBank = null;
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


    //set insurePerson is PolicyHolder or Dependent
    public boolean setInsuredPerson(Customer obj) {

            this.insuredPerson = obj;
            return true;


    }


    public boolean setClaimDate(LocalDate newClaimDate) {
        if (claimDate == null) {
            this.claimDate = newClaimDate;
            return true;
        }
        System.out.println("Claim Date has already been set");
        return false;
    }

    public boolean setExamDate(LocalDate NewExamDate) {
        if (examDate == null){
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
