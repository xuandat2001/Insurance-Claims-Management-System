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
