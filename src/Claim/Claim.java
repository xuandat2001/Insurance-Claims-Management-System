package Claim;

import Customers.Customer;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
/**
 * @author <Ung Xuan Dat - s3932156>
 */
public class Claim {
    private String idClaim;
    private LocalDate claimDate;
    private String cardNumber;
    private Customer insuredPerson;
    private LocalDate examDate;
    private String listOfDoc;
    private Double claimAmount;
    private Status status;
    private Bank inforBank;

    public Claim(String idClaim, Double claimAmount) {
        this.idClaim = idClaim;
        this.claimAmount = claimAmount;
    }

    public void setClaimAmount(Double claimAmount) {
        this.claimAmount = claimAmount;
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
    public void setStatus() {
        LocalDate currentDate = LocalDate.now();
        if (currentDate.isBefore(examDate)){
            this.status = Status.NEW;
        }else if(currentDate.isAfter(examDate) && currentDate.isBefore(claimDate)){
            this.status = Status.PROCESSING;
        }else{
            this.status = Status.DONE;
        }

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

    public String getListOfDoc() {
        if (cardNumber != null) {
            listOfDoc = idClaim +"_"+ cardNumber + ".pdf";
        }
        return listOfDoc;
    }

    public Customer getInsuredPerson() {
        return insuredPerson;
    }

    public boolean setClaimDate(String newClaimDate) {
        if (claimDate == null) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            this.claimDate = LocalDate.parse(newClaimDate, formatter);
            return true;
        }
        System.out.println("Claim Date has already been set");
        return false;
    }

    public boolean setExamDate(String NewExamDate) {
        if (examDate == null){
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            this.examDate = LocalDate.parse(NewExamDate, formatter);
            return true;
        }
        System.out.println("Exam Date has already been set");
        return false;
    }

    //Set Bank Information for claim
    public boolean setInforBank() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Name Bank: ");
        String nameBank = scanner.nextLine();
        System.out.println("Enter the Name Owner: ");
        String nameOwner = scanner.nextLine();
        System.out.println("Enter the Account Number: ");
        String AccountNumber = scanner.nextLine();
        if (inforBank == null){
            this.inforBank = new Bank(nameBank,nameOwner,AccountNumber);
            return true;
        }
        return false;
    }
    public void setCardNum(){
        if (insuredPerson.getInsuranceCard() != null) {
            this.cardNumber = insuredPerson.getInsuranceCard().getCardNum();
        }
        else{
            System.out.println("This customer has not owned InsuranceCard yet");
        }
    }
    @Override
    public String toString() {
        return "Claim{" +
                "idClaim='" + idClaim + '\'' +
                ", claimDate=" + claimDate +
                ", cardNumber='" + cardNumber + '\'' +
                ", insuredPerson=" + insuredPerson+
                ", examDate=" + examDate +
                ", listOfDoc='" + listOfDoc + '\'' +
                ", claimAmount=" + claimAmount +
                ", status=" + status +
                ", inforBank=" + inforBank +
                '}';
    }
}
