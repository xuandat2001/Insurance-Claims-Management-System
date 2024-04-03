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

    public String getIdPolicyOwner() {
        return idPolicyOwner;
    }

    public void setIdPolicyOwner(String idPolicyOwner) {
        this.idPolicyOwner = idPolicyOwner;
    }

    public String getFullNamePolicyOwner() {
        return fullNamePolicyOwner;
    }

    public void setFullNamePolicyOwner(String fullNamePolicyOwner) {
        this.fullNamePolicyOwner = fullNamePolicyOwner;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
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
