package org.example;

public class creditCardBuilder {
    private int id;
    private int customerId;
    private int companyId;
    private String customerName;
    private String companyName;

    public creditCardBuilder setId(int id) {
        this.id = id;
        return this;
    }

    public creditCardBuilder setCustomerId(int customerId) {
        this.customerId = customerId;
        return this;
    }

    public creditCardBuilder setCompanyId(int companyId) {
        this.companyId = companyId;
        return this;
    }

    public creditCardBuilder setCustomerName(String customerName) {
        this.customerName = customerName;
        return this;
    }
    public creditCardBuilder setCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }

    public static creditCardBuilder startBuilder(){
        creditCardBuilder startCardBuilder=new creditCardBuilder();
        return startCardBuilder;
    }

    public static creditCardBuilder createCompanyCard(int id,int companyId,String companyName){
        creditCardBuilder companyCard=new creditCardBuilder();
        companyCard.setCompanyId(companyId);
        companyCard.setCompanyName(companyName);
        companyCard.setId(id);
        companyCard.setCustomerId(0);
        companyCard.setCustomerName("");
        return companyCard;
    }
    public static creditCardBuilder createCustomerCard(int id,int customerId,String customerName){
        creditCardBuilder customerCard=new creditCardBuilder();
        customerCard.setCustomerId(customerId);
        customerCard.setCustomerName(customerName);
        customerCard.setId(id);
        customerCard.setCompanyId(0);
        customerCard.setCompanyName("");
        return customerCard;
    }
public  creditCardBuilder createDefault(int id){
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
