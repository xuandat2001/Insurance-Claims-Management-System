package InsuranceCard;

import Customers.Customer;

import java.time.LocalDate;

public class InsuranceCard {
    private String cardNum;
    private Customer cardHolder;
    private PolicyOwner policyOwner;
    private LocalDate expirationDate;

    public InsuranceCard(String cardNum) {
        this.cardNum = cardNum;
        this.cardHolder = new Customer() {};
        this.policyOwner = null;
        this.expirationDate = null;
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
    public boolean setExpirationDate(LocalDate NewExpirationDate) {
        if (expirationDate == null) {
            this.expirationDate = NewExpirationDate;
           return true;
        }
        System.out.println("ExpirationDate has already set");
        return false;
    }

    //Set PolicyOwner for InsuanceCard
    public boolean setPolicyOwner(PolicyOwner owner) {
        if (policyOwner == null) {
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
                ", policyOwner=" + policyOwner.getFullNamePolicyOwner() +
                ", expirationDate=" + expirationDate +
                '}';
    }
}
