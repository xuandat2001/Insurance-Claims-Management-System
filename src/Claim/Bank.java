package Claim;

public class Bank {

    private String nameBank;
    private String nameOwner;
    private String accountNum;

    public Bank(String nameBank, String nameOwner, String accountNum) {
        this.nameBank = nameBank;
        this.nameOwner = nameOwner;
        this.accountNum = accountNum;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "nameBank='" + nameBank + '\'' +
                ", nameOwner='" + nameOwner + '\'' +
                ", accountNum='" + accountNum + '\'' +
                '}';
    }
}
