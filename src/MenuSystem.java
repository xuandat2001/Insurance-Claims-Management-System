import Customers.Dependent;
import Customers.PolicyHolder;
import Data.LoadDataToList;
import InsuranceCard.InsuranceCard;

import java.util.List;

public class MenuSystem {
    public void Menu(){

        List<PolicyHolder> policyHolderList = LoadDataToList.loadDataToPolicyHolder();
        List<Dependent>dependentList = LoadDataToList.loadDataToDependent();
        List<InsuranceCard>insuranceCardList = LoadDataToList.loadDataToInsuranceCards();
        SystemManage.addDependentToPolicyHolder(policyHolderList,dependentList);// add a dependent into list of a PolicyHolder
        SystemManage.deleteDependentToPolicyHolder(policyHolderList,dependentList); //delete a dependent from list of a PolicyHolder
        SystemManage.addInsuranceCardtoCustomer(policyHolderList,insuranceCardList); // add InsuranceCard to Customer
    }
}
