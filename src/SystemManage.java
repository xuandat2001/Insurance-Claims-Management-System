import Claim.Claim;
import Customers.Dependent;
import Customers.PolicyHolder;
import InsuranceCard.InsuranceCard;
import InsuranceCard.PolicyOwner;
import Interface.ProcessManage;
import java.util.List;
import java.util.Scanner;

public class SystemManage implements ProcessManage {
    private static Scanner scanner = new Scanner(System.in);

    public static void viewAllPolicyHolder(List<PolicyHolder>policyHolderList){
        for (PolicyHolder policyHolder : policyHolderList ){
            System.out.println(policyHolder);
        }
    }
    public static void viewAllDependent(List<Dependent>dependentList){
        for (Dependent dependent : dependentList ){
            System.out.println(dependent);
        }
    }
    public static void viewAllInsuranceCard(List<InsuranceCard>insuranceCardList){
        for (InsuranceCard card :insuranceCardList  ){
            System.out.println(card);
        }
    }

    public static void addDependentToPolicyHolder(List<PolicyHolder>policyHolderList, List<Dependent>dependentList){
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

                        return;
                    }
                }
            }
        }
    }


    public static void deleteDependentToPolicyHolder(List<PolicyHolder>policyHolderList, List<Dependent>dependentList){
        System.out.print("Please input the id of the PolicyHolder: ");
        String policyHolderId = scanner.nextLine();
        for (PolicyHolder policyHolder :  policyHolderList){
            if (policyHolder.getIdCus().equals(policyHolderId)){
                System.out.print("Please input the id of the Dependent: ");
                String dependentId = scanner.nextLine();
                for (Dependent dependent: dependentList){
                    if (dependent.getIdCus().equals(dependentId)){
                        policyHolder.deleteDepentdent(dependent);
                        System.out.println("Remove Successfully");
                        System.out.println(policyHolder);
                        return;
                    }
                }
            }
        }
    }
    public static void addInsuranceCardToCustomer(List<PolicyHolder>policyHolderList, List<InsuranceCard>insuranceCardList){
        int size = policyHolderList.size();
        for (int i = 0; i < size; i++){
            policyHolderList.get(i).setInsuranceCard(insuranceCardList.get(i));
        }
    }
    public static void setPolicyOwnerToInsuranceCard(List<InsuranceCard>insuranceCardList, PolicyOwner policyOwner){
        for (InsuranceCard card: insuranceCardList){
            card.setPolicyOwner(policyOwner);
            break;
        }
    }
    public static void setExpirationDate(List<InsuranceCard>insuranceCardList){
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

    public static void addClaimToCustomer(List<PolicyHolder> policyHolderList, List<Claim> claimList) {

        System.out.print("Please input the id of the PolicyHolder( access to file PolicyHolder.txt to get PolicyHolderID): ");
        String policyHolderId = scanner.nextLine();
        for (PolicyHolder policyHolder :  policyHolderList){
            if (policyHolder.getIdCus().equals(policyHolderId)){
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
    }


    public static void updateClaim(List<Claim>claimList) {
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

    public static void deleteClaimFromCustomer(List<PolicyHolder> policyHolderList, List<Claim> claimList) {
        System.out.print("Please input the id of the PolicyHolder: ");
        String policyHolderId = scanner.nextLine();
        for (PolicyHolder policyHolder :  policyHolderList){
            if (policyHolder.getIdCus().equals(policyHolderId)){
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
    }


    public static  void  getAllClaims(List<Claim>claimList) {
        for (Claim claim : claimList ){
            System.out.println(claim);
        }
    }


    public static void getOneClaim(List<Claim>claimList) {
        System.out.print("Please input the id of the Claim: ");
        String claimId = scanner.nextLine();
        for (Claim claim : claimList){
            if (claim.getIdClaim().equals(claimId)){
                System.out.println(claim);
            }
        }

    }
}
