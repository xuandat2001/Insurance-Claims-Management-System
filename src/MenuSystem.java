import Claim.Claim;
import Customers.Dependent;
import Customers.PolicyHolder;
import Data.LoadDataToList;
import InsuranceCard.InsuranceCard;
import InsuranceCard.PolicyOwner;

import java.util.List;

public class MenuSystem {
    public static void Menu(){
        List<PolicyHolder> policyHolderList = LoadDataToList.loadDataToPolicyHolder();
        List<Dependent>dependentList = LoadDataToList.loadDataToDependent();
        List<InsuranceCard>insuranceCardList = LoadDataToList.loadDataToInsuranceCards();
        List<Claim>claimList = LoadDataToList.loadDataToClaim();
        PolicyOwner policyOwner = LoadDataToList.loadDataPolicyOwner();
        /*SystemManage.addDependentToPolicyHolder(policyHolderList,dependentList);// add a dependent into list of a PolicyHolder
        SystemManage.deleteDependentToPolicyHolder(policyHolderList,dependentList); //delete a dependent from list of a PolicyHolder
        SystemManage.addInsuranceCardToCustomer(policyHolderList,insuranceCardList); // add InsuranceCard to Customer
        SystemManage.addClaimToCustomer(policyHolderList,claimList);// add Claim to Customer's claim list
        SystemManage.removeClaimToCustomer(policyHolderList,claimList);// remove Claim to Customer's claim list
        SystemManage.setPolicyOwnerToInsuranceCard(insuranceCardList,policyOwner);//set PolicyOwner for InsuranceCard
        SystemManage.setExpirationDate(insuranceCardList); //set ExpirationDate for InsuranceCard
        SystemManage.setClaimDate(claimList);//set ClaimDate for Claim
        SystemManage.setExamDate(claimList);//set ExamDate for Claim
        SystemManage.addInsuranceCardToCustomer(policyHolderList,insuranceCardList);
        SystemManage.addClaimToCustomer(policyHolderList,claimList);// add Claim to Customer's claim list
        SystemManage.setBank(claimList);
        SystemManage.setClaimDate(claimList);//set ClaimDate for Claim
        SystemManage.setExamDate(claimList);//set ExamDate for Claim
        SystemManage.setStatus(claimList);// //set Status for Claim*/
        SystemManage.setClaimAmount(claimList);//set new Claim Amount for Claim

    }
}
