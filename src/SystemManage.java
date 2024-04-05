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
                        System.out.println(policyHolder);
                        return;
                    }
                }
            }
        }
    }
    public static void addInsuranceCardToCustomer(List<PolicyHolder>policyHolderList, List<InsuranceCard>insuranceCardList){
        System.out.print("Please input the id of the PolicyHolder: ");
        String policyHolderId = scanner.nextLine();
        for (PolicyHolder policyHolder :  policyHolderList){
            if (policyHolder.getIdCus().equals(policyHolderId)){
                System.out.print("Please input the cardNumber: ");
                String cardId = scanner.nextLine();
                for (InsuranceCard card: insuranceCardList){
                    if (card.getCardNum().equals(cardId)){
                        policyHolder.setInsuranceCard(card);
                        policyHolder.displayDetailInsuranceCard();
                        return;
                    }
                }
            }
        }
    }


    public static void addClaimToCustomer(List<PolicyHolder>policyHolderList, List<Claim>claimList){
        System.out.print("Please input the id of the PolicyHolder: ");
        String policyHolderId = scanner.nextLine();
        for (PolicyHolder policyHolder :  policyHolderList){
            if (policyHolder.getIdCus().equals(policyHolderId)){
                System.out.print("Please input the ClaimId: ");
                String claimId = scanner.nextLine();
                for (Claim claim: claimList){
                    if (claim.getIdClaim().equals(claimId)){
                        policyHolder.addClaim(claim);
                        claim.setCardNum();
                        claim.getListOfDoc();
                        policyHolder.displayClaim();
                        return;
                    }
                }
            }
        }
    }

    public static void removeClaimToCustomer(List<PolicyHolder>policyHolderList, List<Claim>claimList){
        System.out.print("Please input the id of the PolicyHolder: ");
        String policyHolderId = scanner.nextLine();
        for (PolicyHolder policyHolder :  policyHolderList){
            if (policyHolder.getIdCus().equals(policyHolderId)){
                System.out.print("Please input the ClaimId: ");
                String claimId = scanner.nextLine();
                for (Claim claim: claimList){
                    if (claim.getIdClaim().equals(claimId)){
                        policyHolder.deleteClaim(claim);
                        policyHolder.displayClaim();
                        return;
                    }
                }
            }
        }
    }
    public static void setPolicyOwnerToInsuranceCard(List<InsuranceCard>insuranceCardList, PolicyOwner policyOwner){
        for (InsuranceCard card: insuranceCardList){
            card.setPolicyOwner(policyOwner);
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
                System.out.println(card);
            }
        }
    }

    public static void setClaimDate(List<Claim>claimList){
        System.out.print("Please input the date with format dd/MM/yyyy: ");
        String newDate= scanner.nextLine();
        for (Claim claim: claimList){
            System.out.print("Please input the Claim ID: ");
            String claimId = scanner.nextLine();
            if (claim.getIdClaim().equals(claimId)){
                claim.setClaimDate(newDate);
                System.out.println(claim);
                break;
            }
        }
    }
    public static void setExamDate(List<Claim>claimList){
        System.out.print("Please input the date with format dd/MM/yyyy: ");
        String newDate= scanner.nextLine();
        for (Claim claim: claimList){
            System.out.print("Please input the Claim ID: ");
            String claimId = scanner.nextLine();
            if (claim.getIdClaim().equals(claimId)){
                claim.setExamDate(newDate);
                System.out.println(claim);
                break;
            }
        }
    }
    public static void setBank(List<Claim>claimList){
        for (Claim claim: claimList){
            System.out.print("Please input the Claim ID: ");
            String claimId = scanner.nextLine();
            if (claim.getIdClaim().equals(claimId)){
                claim.setInforBank();
                System.out.println(claim);
                break;
            }
        }
    }
    public static void setStatus(List<Claim>claimList){
        for (Claim claim: claimList){
            System.out.print("Please input the Claim ID: ");
            String claimId = scanner.nextLine();
            if (claim.getIdClaim().equals(claimId)){
                claim.setStatus();
                System.out.println(claim);
                break;
            }
        }
    }

    public static void setClaimAmount(List<Claim>claimList){
        for (Claim claim: claimList){
            System.out.print("Please input the Claim ID: ");
            String claimId = scanner.nextLine();
            if (claim.getIdClaim().equals(claimId)){
                System.out.print("Please input the new Claim Amount: ");
                double claimAmount = scanner.nextDouble();
                claim.setClaimAmount(claimAmount);
                System.out.println(claim);
                break;
            }
        }
    }



 

    @Override
    public boolean add() {

        return false;
    }

    @Override
    public boolean update() {
        return false;
    }

    @Override
    public boolean delete() {
        return false;
    }

    @Override
    public void getAll() {

    }

    @Override
    public void getOne() {

    }
}
