package InsuranceCard;

public class PolicyOwner {
    private String idPolicyOwner;
    private String fullNamePolicyOwner;
    private String location;

    public PolicyOwner(String idPolicyOwner, String fullNamePolicyOwner, String location) {
        this.idPolicyOwner = idPolicyOwner;
        this.fullNamePolicyOwner = fullNamePolicyOwner;
        this.location = location;
    }

    public PolicyOwner() {
        this.idPolicyOwner = null;
        this.fullNamePolicyOwner = null;
        this.location = null;
    }

    @Override
    public String toString() {
        return "PolicyOwner{" +
                "idPolicyOwner='" + idPolicyOwner + '\'' +
                ", fullNamePolicyOwner='" + fullNamePolicyOwner + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
