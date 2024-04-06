import Claim.Claim;
import Customers.Dependent;
import Customers.PolicyHolder;
import Data.LoadDataToList;
import InsuranceCard.InsuranceCard;
import InsuranceCard.PolicyOwner;

import java.util.List;
import java.util.Scanner;

public class MenuSystem {
    public static void menu(){
        List<PolicyHolder> policyHolderList = LoadDataToList.loadDataToPolicyHolder();
        List<Dependent>dependentList = LoadDataToList.loadDataToDependent();
        List<InsuranceCard>insuranceCardList = LoadDataToList.loadDataToInsuranceCards();
        List<Claim>claimList = LoadDataToList.loadDataToClaim();
        PolicyOwner policyOwner = LoadDataToList.loadDataPolicyOwner();
        SystemManage.addInsuranceCardToCustomer(policyHolderList,insuranceCardList);

        while (true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Welcome to the Admin DashBoard");
            System.out.println("1: View all Customers");
            System.out.println("2: View all InsuranceCards");
            System.out.println("3: View all Claims");
            System.out.println("4: Exit Program");
            System.out.print("Enter your choice: ");
            String choiceAdmin = scanner.nextLine();
            if (choiceAdmin.equals("1")){
               SystemManage.viewAllPolicyHolder(policyHolderList);
               SystemManage.viewAllDependent(dependentList);
                label:
                while (true){
                    System.out.println("1: Add Claim");
                    System.out.println("2: Remove Claim");
                    System.out.println("3: Add Dependent");
                    System.out.println("4: Remove Dependent");
                    System.out.println("5: Back to Main Menu");
                    System.out.print("Enter your choice: ");
                    choiceAdmin = scanner.nextLine();
                    switch (choiceAdmin) {
                        case "1":
                            SystemManage.addClaimToCustomer(policyHolderList, claimList);
                            break;
                        case "2":
                            SystemManage.deleteClaimFromCustomer(policyHolderList, claimList);
                            break;
                        case "3":
                            SystemManage.addDependentToPolicyHolder(policyHolderList, dependentList);
                            break;
                        case "4":
                            SystemManage.deleteDependentToPolicyHolder(policyHolderList, dependentList);
                            break;
                        case "5":
                            break label;
                        default:
                            System.out.println("Invalid value, please enter your choice again");
                            break;
                    }
                }
            }
            else if(choiceAdmin.equals("2")){
                SystemManage.viewAllInsuranceCard(insuranceCardList);
                System.out.println("1: Update InsuranceCard");
                System.out.println("2: Back to Main Menu");
                System.out.print("Enter your choice: ");
                choiceAdmin = scanner.nextLine();
                while (true){
                    if(choiceAdmin.equals("1")){
                        SystemManage.setPolicyOwnerToInsuranceCard(insuranceCardList,policyOwner);//set PolicyOwner for InsuranceCard
                        SystemManage.setExpirationDate(insuranceCardList); //set ExpirationDate for InsuranceCard
                        break;
                    }
                    else if(choiceAdmin.equals("2")){
                        break;
                    }
                    else {
                        System.out.println("Invalid value, please enter your choice again");
                    }
                }
            }
            else if(choiceAdmin.equals("3")){
                System.out.println("List Id of Claim: ");
                for (Claim claim:claimList){
                    System.out.println(claim.getIdClaim());
                }
                System.out.println("1: Update Specific Claim");
                System.out.println("2: View All Claims");
                System.out.println("3: View Specific Claim");
                System.out.println("4: Back to Main Menu");
                System.out.print("Enter your choice: ");
                choiceAdmin = scanner.nextLine();
                while (true){
                    if(choiceAdmin.equals("1")){
                        SystemManage.updateClaim(claimList);//set PolicyOwner for InsuranceCard
                        break;
                    }
                    else if(choiceAdmin.equals("2")){
                        SystemManage.getAllClaims(claimList);
                        break;
                    }
                    else if(choiceAdmin.equals("3")){
                        SystemManage.getOneClaim(claimList);
                        break;
                    }
                    else if(choiceAdmin.equals("4")){
                        break;
                    }
                    else {
                        System.out.println("Invalid value, please enter your choice again");
                    }
                }
            }
            else if(choiceAdmin.equals("4")){
                System.out.println("Exit Program. Have a nice day");
                break;
            }
            else{
                System.out.println("Invalid value, please enter your choice again");
            }

        }

    }
}
