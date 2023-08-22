package org.example;

public class creditCard {
    private int id;
    private int customerId;
    private int companyId;
    private String customerName;
    private String companyName;

    @Override
    public String toString() {
        return "creditCard{" +
                "id=" + id +
                ", customerId=" + customerId +
                ", companyId=" + companyId +
                ", customerName='" + customerName + '\'' +
                ", companyName='" + companyName + '\'' +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
