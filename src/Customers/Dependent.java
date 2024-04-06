package Customers;

import InsuranceCard.InsuranceCard;

public class  Dependent extends Customer{
    private boolean isDepended= true;
    public Dependent(String idCus, String fullNameCus) {
        super(idCus, fullNameCus);
    }

    public boolean isDepended() {
        return isDepended;
    }

    public void setDepended(boolean depended) {
        isDepended = depended;
    }
    @Override
    public String toString() {
        return "Dependent{" +
                "idCus='" + getIdCus() + '\'' +
                ", fullNameCus='" + getFullNameCus() + '\'' +
                '}';
    }
}
