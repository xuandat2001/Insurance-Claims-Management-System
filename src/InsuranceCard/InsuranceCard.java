package InsuranceCard;

import Customers.Customer;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
/**
 * @author <Ung Xuan Dat - s3932156>
 */
public class InsuranceCard {
    private String cardNum;
    private Customer cardHolder;
    private PolicyOwner policyOwner;
    private LocalDate expirationDate;

    public InsuranceCard(String cardNum) {
        this.cardNum = cardNum;
    }

    public InsuranceCard() {
        this.cardNum = null;
        this.cardHolder = null;
        this.policyOwner = null;
        this.expirationDate = null;
    }

    public String getCardNum() {
        return cardNum;
    }

    public Customer getCardHolder() {
        return cardHolder;
    }

    //Set cardHolder for InsuanceCard


    public void setCardHolder(Customer cus) {
                this.cardHolder = cus;
        }



    /**
     * set the expirationDate
     * <p>
     * Given a newExpirationDate, convert it into LocalDate by DateTimeFormatter and  assign it as the expirationDate.
     * If the assignment is successful, return true,
     * otherwise, return false
     * </p>
     * @param newExpirationDate the new date to set
     * @return true if the assignment is successful, otherwise, return false
     */
    public boolean setExpirationDate(String newExpirationDate) {
        if (expirationDate == null) {
            /*
                the condition below must satisfy
                the expirationDate of InsuranceCard must be null
            */
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            this.expirationDate = LocalDate.parse(newExpirationDate, formatter);
           return true;
        }
        System.out.println("ExpirationDate has already set");
        return false;
    }


    /**
     * set the PolicyOwner
     * <p>
     * Given a PolicyOwner , assign it as the policyOwner.
     * If the assignment is successful, return true,
     * otherwise, return false
     * </p>
     * @param owner the new PolicyOwner to set
     * @return true if the assignment is successful, otherwise, return false
     */
    //Set PolicyOwner for InsuanceCard
    public boolean setPolicyOwner(PolicyOwner owner) {
        if (policyOwner == null) {
                        /*
                the condition below must satisfy
                the policyOwner of InsuranceCard must be null
            */
            this.policyOwner = owner;
            return true;
        }
        System.out.println("This card has already been had an PolicyOwner");
        return  false;
    }

    @Override
    public String toString() {
        return "InsuranceCard{" +
                "cardNum='" + cardNum + '\'' +
                ", cardHolder=" + cardHolder.getFullNameCus() +
                ", policyOwner=" + policyOwner +
                ", expirationDate=" + expirationDate +
                '}';
    }
}
