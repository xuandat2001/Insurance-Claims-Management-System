package Customers;
import java.util.ArrayList;
import java.util.List;
/**
 * @author <Ung Xuan Dat - s3932156>
 */
public class PolicyHolder extends Customer {
    private List<Dependent> listOfDependents;

    public PolicyHolder(String idCus, String fullNameCus) {
        super(idCus, fullNameCus);
         listOfDependents = new ArrayList<Dependent>();
    }

    public PolicyHolder() {
        listOfDependents = null;
    }



    /**
     * add the dependent to the customer's dependentList
     * <p>
     * Given a dependent, set its isDepended is true.
     * If the assignment is successful, return true,
     * otherwise, return false
     * </p>
     * @param dependent the claim to add
     * @return true if the assignment is successful, otherwise, return false
     */
    public boolean addDepentdent(Dependent dependent){
        if (!dependent.isDepended() && !listOfDependents.contains(dependent)){
            /*
                two conditions below must satisfy
                the dependent's isDepended() = false.
                the dependent is not contained in the PolicyHolder's listOfDependent
            */
            listOfDependents.add(dependent);
            dependent.setInsuranceCard(this.getInsuranceCard());
            dependent.setDepended(true);
            return true;
        }
        System.out.println("this person is depended");
        return false;
    }



    /**
     * delete the dependent to the customer's dependentList
     * <p>
     * Given a dependent, set its isDepended is true.
     * If the assignment is successful, return true,
     * otherwise, return false
     * </p>
     * @param dependent the claim to delete
     * @return true if the assignment is successful, otherwise, return false
     */
    public boolean deleteDepentdent(Dependent dependent){
        if (listOfDependents.contains(dependent)){
            /*
                the condition below must satisfy
                the dependent is contained in the PolicyHolder's listOfDependent
            */
            listOfDependents.remove(dependent);
            dependent.setDepended(true);
            return true;
        }
        System.out.println("this person is not in your dependentList");
        return false;
    }
    @Override
    public String toString() {
        return "PolicyHolder{" +
                "idCus='" + getIdCus() + '\'' +
                ", fullNameCus='" + getFullNameCus() + '\'' +
                ", insuranceCard=" + getInsuranceCard().getCardNum() +'\''+
                "listOfDependents=" + listOfDependents +
                '}';
    }
}
