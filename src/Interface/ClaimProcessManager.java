package Interface;

import Claim.Claim;
import Customers.Dependent;
import Customers.PolicyHolder;

import java.util.List;
/**
 * @author <Ung Xuan Dat - s3932156>
 */
public interface ClaimProcessManager {
    public void addClaimToCustomer(List<PolicyHolder> policyHolderList, List<Dependent> dependentList, List<Claim> claimList);
    public void updateClaim(List<Claim>claimList);

    public  void deleteClaimFromCustomer(List<PolicyHolder> policyHolderList,List<Dependent> dependentList, List<Claim> claimList);

    public void getAllClaims(List<Claim>claimList);

    public void getOneClaim(List<Claim>claimList );


}
