package Customers;

import InsuranceCard.InsuranceCard;

import java.util.ArrayList;
import java.util.List;

public class PolicyHolder extends Customer {
    private List<Dependent> listOfDependents;

    public PolicyHolder(String idCus, String fullNameCus) {
        super(idCus, fullNameCus);
        this.listOfDependents = listOfDependents;
    }

}
