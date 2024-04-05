package Data;

import Claim.Claim;
import Customers.Customer;
import Customers.Dependent;
import Customers.PolicyHolder;
import Data.DataLoader;
import InsuranceCard.InsuranceCard;
import InsuranceCard.PolicyOwner;
import java.util.List;
import java.util.ArrayList;

public class  LoadDataToList {
    private static DataLoader dataLoader;
    private static List<String[]>dataList;
    public static  List<PolicyHolder> loadDataToPolicyHolder(){
        List<PolicyHolder> policyHolderList = new ArrayList<>();
        dataLoader = new DataLoader("src/Data/PolicyHolder.txt");
        dataList = dataLoader.readDataFromFile();
        for (String[] data : dataList){
            String idCus = data[0];
            String nameCus = data[1];
            policyHolderList.add(new PolicyHolder(idCus,nameCus));
        }
        return policyHolderList;
    }
    public static List<Dependent> loadDataToDependent(){
        List<Dependent> dependentList = new ArrayList<>();
        dataLoader = new DataLoader("src/Data/Dependent.txt");
        dataList = dataLoader.readDataFromFile();
        for (String[] data : dataList){
            String idCus = data[0];
            String nameCus = data[1];
            dependentList.add(new Dependent(idCus,nameCus));
        }
        return dependentList;
    }
    public static List<InsuranceCard> loadDataToInsuranceCards(){
        List<InsuranceCard> listOfInsuranceCards = new ArrayList<>();
        dataLoader = new DataLoader("src/Data/insuranceCard.txt");
        dataList = dataLoader.readDataFromFile();
        for (String[] data : dataList){
            String idCard = data[0];
            listOfInsuranceCards.add(new InsuranceCard(idCard));
        }
        return listOfInsuranceCards;
    }
    public static List<Claim> loadDataToClaim(){
        List<Claim> listOfClaims = new ArrayList<>();
        dataLoader = new DataLoader("src/Data/claim.txt");
        dataList = dataLoader.readDataFromFile();
        for (String[] data : dataList){
            String idClaim = data[0];
            String claimAmount = data[1];
            listOfClaims.add(new Claim(idClaim, Double.parseDouble(claimAmount)));
        }
        return listOfClaims;
    }

    public static PolicyOwner loadDataPolicyOwner(){
       PolicyOwner policyOwnerObject = new PolicyOwner();
        dataLoader = new DataLoader("src/Data/PolicyOwner.txt");
        dataList = dataLoader.readDataFromFile();
        for (String[] data : dataList){
            String policyOwner = data[0];
            String fullName = data[1];
            String location = data[2];
            policyOwnerObject = new PolicyOwner(policyOwner, fullName,location);
        }
        return policyOwnerObject;
    }

}
