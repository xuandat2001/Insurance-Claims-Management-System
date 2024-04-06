package Interface;

import Claim.Claim;
import Customers.Dependent;
import Customers.PolicyHolder;

import java.util.List;

public interface ClaimProcessManager {
    public void addClaimToCustomer(List<PolicyHolder> policyHolderList, List<Dependent> dependentList, List<Claim> claimList);
    public void updateClaim(List<Claim>claimList);

    public  void deleteClaimFromPolicyHolder(List<PolicyHolder> policyHolderList,List<Dependent> dependentList, List<Claim> claimList);

    public void getAllClaims(List<Claim>claimList);

    public void getOneClaim(List<Claim>claimList);


}
