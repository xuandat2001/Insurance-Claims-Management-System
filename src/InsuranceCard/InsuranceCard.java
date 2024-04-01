package InsuranceCard;

import Customers.Customer;

import java.util.Date;

public class InsuranceCard {
    private String cardNum;
    private Customer cardHolder;
    private PolicyOwner policyOwner;
    private Date expirationDate;

    public InsuranceCard(String cardNum, Customer cardHolder, PolicyOwner policyOwner, Date expirationDate) {
        this.cardNum = cardNum;
        this.cardHolder = cardHolder;
        this.policyOwner = policyOwner;
        this.expirationDate = expirationDate;
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


    //Set cardHolder for InsuanceCard
    public boolean setCardHolder(Customer cus) {
        if (cardHolder == null) {
            this.cardHolder = cus;
            return true;
        }
        System.out.println("This card has already been owned an customer");
        return  false;
    }

    public boolean setExpirationDate(Date NewExpirationDate) {
        if (expirationDate == null) {
            this.expirationDate = NewExpirationDate;
           return true;
        }
        System.out.println("ExpirationDate has already set");
        return false;
    }

    //Set PolicyOwner for InsuanceCard
    public boolean setPolicyOwner(PolicyOwner owner) {
        if (owner == null) {
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
                ", cardHolder=" + cardHolder +
                ", policyOwner=" + policyOwner +
                ", expirationDate=" + expirationDate +
                '}';
    }
}
