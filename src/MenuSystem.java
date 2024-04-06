import Claim.Claim;
import Customers.Dependent;
import Customers.PolicyHolder;
import Data.LoadDataToList;
import InsuranceCard.InsuranceCard;
import InsuranceCard.PolicyOwner;
import java.util.List;
import java.util.Scanner;

public class MenuSystem {
    private static SystemManage sys = new SystemManage();
    public static void menu(){
        List<PolicyHolder> policyHolderList = LoadDataToList.loadDataToPolicyHolder(); //initialize policyHolderList
        List<Dependent>dependentList = LoadDataToList.loadDataToDependent();//initialize dependentList
        List<InsuranceCard>insuranceCardList = LoadDataToList.loadDataToInsuranceCards();//initialize insuranceCardList
        List<Claim>claimList = LoadDataToList.loadDataToClaim();//initialize claimList
        PolicyOwner policyOwner = LoadDataToList.loadDataPolicyOwner(); //initialize policyOwner
        sys.addInsuranceCardToCustomer(policyHolderList,insuranceCardList);// add InsuranceCard to Customers
        sys.setPolicyOwnerToInsuranceCard(insuranceCardList,policyOwner);//set PolicyOwner for InsuranceCard
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
                sys.viewAllPolicyHolder(policyHolderList); //view all PolicyHolders
                sys.viewAllDependent(dependentList);// view all Dependents
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
                            sys.addClaimToCustomer(policyHolderList, dependentList,claimList);//add claim into Customer's ClaimList
                            break;
                        case "2":
                            sys.deleteClaimFromPolicyHolder(policyHolderList, dependentList,claimList);//delete claim into Customer's ClaimList
                            break;
                        case "3":
                            sys.addDependentToPolicyHolder(policyHolderList, dependentList);//add dependent from policyHolder
                            break;
                        case "4":
                            sys.deleteDependentToPolicyHolder(policyHolderList, dependentList);//delete dependent from policyHolder
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
                sys.viewAllInsuranceCard(insuranceCardList);
                System.out.println("1: Update InsuranceCard");
                System.out.println("2: Back to Main Menu");
                System.out.print("Enter your choice: ");
                choiceAdmin = scanner.nextLine();
                while (true){
                    if(choiceAdmin.equals("1")){
                        sys.setExpirationDate(insuranceCardList); //set ExpirationDate for InsuranceCard
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
                    System.out.println(claim.getIdClaim());// get id of all claims
                }
                System.out.println("1: Update Specific Claim");
                System.out.println("2: View All Claims");
                System.out.println("3: View Specific Claim");
                System.out.println("4: Back to Main Menu");
                System.out.print("Enter your choice: ");
                choiceAdmin = scanner.nextLine();
                while (true){
                    if(choiceAdmin.equals("1")){
                        sys.updateClaim(claimList);//set PolicyOwner for InsuranceCard
                        break;
                    }
                    else if(choiceAdmin.equals("2")){
                        sys.getAllClaims(claimList);// view all Claims
                        break;
                    }
                    else if(choiceAdmin.equals("3")){
                        sys.getOneClaim(claimList);// view one Claim
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
