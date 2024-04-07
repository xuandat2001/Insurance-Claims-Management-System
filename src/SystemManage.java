import Claim.Claim;
import Customers.Dependent;
import Customers.PolicyHolder;
import InsuranceCard.InsuranceCard;
import InsuranceCard.PolicyOwner;
import Interface.ClaimProcessManager;
import java.util.List;
import java.util.Scanner;
/**
 * @author <Ung Xuan Dat - s3932156>
 */
public class SystemManage implements ClaimProcessManager {
    private static Scanner scanner = new Scanner(System.in);


    //view all PolicyHolders
    public void viewAllPolicyHolder(List<PolicyHolder>policyHolderList){
        for (PolicyHolder policyHolder : policyHolderList ){
            System.out.println(policyHolder);
        }
    }


    //view all Dependents
    public void viewAllDependent(List<Dependent>dependentList){
        for (Dependent dependent : dependentList ){
            System.out.println(dependent);
        }
    }

    //view all InsuranceCards
    public void viewAllInsuranceCard(List<InsuranceCard>insuranceCardList){
        for (InsuranceCard card :insuranceCardList  ){
            System.out.println(card);
        }
    }

    //addDependentToPolicyHolder
    public void addDependentToPolicyHolder(List<PolicyHolder>policyHolderList, List<Dependent>dependentList){
        System.out.print("Please input the id of the PolicyHolder: ");
        String policyHolderId = scanner.nextLine();
        for (PolicyHolder policyHolder :  policyHolderList){
            if (policyHolder.getIdCus().equals(policyHolderId)){
                System.out.print("Please input the id of the Dependent: ");
                String dependentId = scanner.nextLine();
                for (Dependent dependent: dependentList){
                    if (dependent.getIdCus().equals(dependentId)){
                        policyHolder.addDepentdent(dependent);
                        System.out.println("Add Successfully");
                        System.out.println(policyHolder);
                        System.out.println(dependent);
                        return;
                    }
                }
            }
        }
    }

    //deleteDependentToPolicyHolder
    public void deleteDependentToCustomer(List<PolicyHolder>policyHolderList, List<Dependent>dependentList){
        System.out.print("Please input the id of the PolicyHolder: ");
        String policyHolderId = scanner.nextLine();
        for (PolicyHolder policyHolder :  policyHolderList){
            if (policyHolder.getIdCus().equals(policyHolderId)){
                System.out.print("Please input the id of the Dependent: ");
                String dependentId = scanner.nextLine();
                for (Dependent dependent: dependentList){
                    if (dependent.getIdCus().equals(dependentId)){
                        policyHolder.deleteDepentdent(dependent);
                        dependent.setInsuranceCard(null);
                        System.out.println("Remove Successfully");
                        System.out.println(policyHolder);
                        System.out.println(dependent);
                        return;
                    }
                }
            }
        }
    }

    //addInsuranceCardToCustomer
    public void addInsuranceCardToCustomer(List<PolicyHolder>policyHolderList, List<InsuranceCard>insuranceCardList){
        int size = policyHolderList.size();
        for (int i = 0; i < size; i++){
            policyHolderList.get(i).setInsuranceCard(insuranceCardList.get(i));
        }
    }

    //setPolicyOwnerToInsuranceCard
    public void setPolicyOwnerToInsuranceCard(List<InsuranceCard>insuranceCardList, PolicyOwner policyOwner){
        for (InsuranceCard card: insuranceCardList){
            card.setPolicyOwner(policyOwner);

        }
    }

    //setExpirationDate
    public void setExpirationDate(List<InsuranceCard>insuranceCardList){
        System.out.print("Please input the date with format dd/MM/yyyy: ");
        String newDate= scanner.nextLine();
        for (InsuranceCard card: insuranceCardList){
            System.out.print("Please input the cardNumber: ");
            String cardId = scanner.nextLine();
            if (card.getCardNum().equals(cardId)){
                card.setExpirationDate(newDate);
                System.out.println("Update Successfully");
                System.out.println(card);
                return;
            }
        }
    }



    // addClaimToCustomer
    @Override
    public void addClaimToCustomer(List<PolicyHolder> policyHolderList, List<Dependent> dependentList, List<Claim> claimList) {
        String cusId;
        System.out.print("Please input the id of the Customer: ");
        cusId = scanner.nextLine();
        for (PolicyHolder policyHolder :  policyHolderList){
            if (policyHolder.getIdCus().equals(cusId)){
                System.out.print("Please input the ClaimId( access to file claim.txt to get claimID): ");
                String claimId = scanner.nextLine();
                for (Claim claim: claimList){
                    if (claim.getIdClaim().equals(claimId)){
                        policyHolder.addClaim(claim);
                        claim.setCardNum();
                        claim.getListOfDoc();
                        policyHolder.displayClaim();
                        System.out.println("Add Successfully");
                    }
                }
            }
        }
        for (Dependent dependent: dependentList){
            if (dependent.getIdCus().equals(cusId) && dependent.getInsuranceCard()!=null){
                System.out.print("Please input the ClaimId( access to file claim.txt to get claimID): ");
                String claimId = scanner.nextLine();
                for (Claim claim: claimList){
                    if (claim.getIdClaim().equals(claimId)){
                        dependent.addClaim(claim);
                        claim.setCardNum();
                        claim.getListOfDoc();
                        dependent.displayClaim();
                        System.out.println("Add Successfully");
                    }
                }
            }

        }
    }


    //updateClaim
    @Override
    public void updateClaim(List<Claim>claimList) {
        System.out.print("Please input the ClaimId( access to file insuranceCard.txt to get insuranceCardID): ");
        String claimId = scanner.nextLine();
        for (Claim claim: claimList) {
            if (claim.getIdClaim().equals(claimId)){
                System.out.print("Please input the Claim date with format dd/MM/yyyy: ");
                String claimDate= scanner.nextLine();
                claim.setClaimDate(claimDate);

                System.out.print("Please input the Exam date with format dd/MM/yyyy: ");
                String examDate= scanner.nextLine();
                claim.setExamDate(examDate);
                claim.setStatus();

                claim.setInforBank();

                System.out.println("Update Successfully");
                System.out.println(claim);
            }

        }
    }


    //deleteClaimFromPolicyHolder
    @Override
    public void deleteClaimFromCustomer(List<PolicyHolder> policyHolderList,List<Dependent> dependentList, List<Claim> claimList) {
        String cusId;
        System.out.print("Please input the id of the Customer: ");
        cusId = scanner.nextLine();
        for (PolicyHolder policyHolder :  policyHolderList){
            if (policyHolder.getIdCus().equals(cusId)){
                policyHolder.displayClaim();
                System.out.print("Please input the ClaimId: ");
                String claimId = scanner.nextLine();
                for (Claim claim: claimList){
                    if (claim.getIdClaim().equals(claimId)){
                        policyHolder.deleteClaim(claim);
                        System.out.println("Remove Successfully");
                        System.out.println(policyHolder);
                    }
                }
            }
        }
        for (Dependent dependent : dependentList){
            if (dependent.getIdCus().equals(cusId) && dependent.getInsuranceCard()!=null){
                dependent.displayClaim();
                System.out.print("Please input the ClaimId( access to file claim.txt to get claimID): ");
                String claimId = scanner.nextLine();
                for (Claim claim: claimList){
                    if (claim.getIdClaim().equals(claimId)){
                        dependent.deleteClaim(claim);
                        System.out.println("Remove Successfully");
                    }
                }
            }
        }
    }
    @Override
    // getAllClaims
    public  void  getAllClaims(List<Claim>claimList) {
        for (Claim claim : claimList ){
            System.out.println(claim);
        }
    }
    @Override
    //getOneClaim
    public void getOneClaim(List<Claim>claimList) {
        System.out.print("Please input the id of the Claim: ");
        String claimId = scanner.nextLine();
        for (Claim claim : claimList){
            if (claim.getIdClaim().equals(claimId)){
                System.out.println(claim);
            }
        }

    }


}
