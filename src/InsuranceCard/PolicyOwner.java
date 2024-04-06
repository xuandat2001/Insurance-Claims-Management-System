package InsuranceCard;

public class PolicyOwner {
    private String fullNamePolicyOwner;
    private String location;

    public PolicyOwner( String fullNamePolicyOwner, String location) {
        this.fullNamePolicyOwner = fullNamePolicyOwner;
        this.location = location;
    }

    public PolicyOwner() {

        this.fullNamePolicyOwner = null;
        this.location = null;
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
                ", fullNamePolicyOwner='" + fullNamePolicyOwner + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
