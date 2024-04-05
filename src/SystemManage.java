import Claim.Claim;
import Customers.Customer;
import Customers.Dependent;
import Customers.PolicyHolder;
import InsuranceCard.InsuranceCard;
import Interface.ProcessManage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SystemManage implements ProcessManage {
    public static boolean addDependentToPolicyHolder(List<PolicyHolder>policyHolderList,List<Dependent>dependentList){
        Scanner scanner = new Scanner(System.in);
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
                        return true;
                    }
                }
            }
        }
        return false;
    }


    public static boolean deleteDependentToPolicyHolder(List<PolicyHolder>policyHolderList,List<Dependent>dependentList){
        Scanner scanner = new Scanner(System.in);
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
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public static boolean addInsuranceCardtoCustomer(List<PolicyHolder>policyHolderList,List<InsuranceCard>insuranceCardList){
        Scanner scanner = new Scanner(System.in);
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
                        return true;
                    }
                }
            }
        }
        return false;
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
