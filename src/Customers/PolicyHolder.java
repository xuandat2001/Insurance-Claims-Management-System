package Customers;

import InsuranceCard.InsuranceCard;

import java.util.ArrayList;
import java.util.List;

public class PolicyHolder extends Customer {
    private List<Dependent> listOfDependents;

    public PolicyHolder(String idCus, String fullNameCus) {
        super(idCus, fullNameCus);
         listOfDependents = new ArrayList<Dependent>();
    }

    public PolicyHolder() {
        listOfDependents = null;
    }

    public boolean addDepentdent(Dependent dependent){
        if (dependent.isDepended() && !listOfDependents.contains(dependent)){
            listOfDependents.add(dependent);
            dependent.setDepended(false);
            return true;
        }
        System.out.println("this person is depended");
        return false;
    }
    public boolean deleteDepentdent(Dependent dependent){
        if (listOfDependents.contains(dependent)){
            listOfDependents.remove(dependent);
            dependent.setDepended(true);
            return true;
        }
        System.out.println("this person is not in your dependentList");
        return false;
    }
    @Override
    public String toString() {
        return "PolicyHolder{" +
                "idCus='" + getIdCus() + '\'' +
                ", fullNameCus='" + getFullNameCus() + '\'' +
                ", insuranceCard=" + getInsuranceCard().getCardNum() +'\''+
                "listOfDependents=" + listOfDependents +
                '}';
    }
}
