package org.example;

public class creditCardBuilder {
    private int id;
    private int customerId;
    private int companyId;
    private String customerName;
    private String companyName;

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
    public static creditCardBuilder createCompanyCard(int id,int companyId,String companyName){
        creditCardBuilder companyCard=new creditCardBuilder();
        companyCard.setCompanyId(companyId);
        companyCard.setCompanyName(companyName);
        companyCard.setId(id);

        return companyCard;
    }
    public static creditCardBuilder createCustomerCard(int id,int customerId,String customerName){
        creditCardBuilder customerCard=new creditCardBuilder();
        customerCard.setCustomerId(customerId);
        customerCard.setCustomerName(customerName);
        customerCard.setId(id);
        return customerCard;
    }
public creditCardBuilder createDefault(int id){
        this.id=id;
        return this;
}
    public creditCard build(){
        creditCard card=new creditCard();
        card.setId(id);
        card.setCompanyId(companyId);
        card.setCompanyName(companyName);
        card.setCustomerId(customerId);
        card.setCustomerName(customerName);
        return card;
    }
}
