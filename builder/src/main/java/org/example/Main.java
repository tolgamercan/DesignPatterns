package org.example;

public class Main {
    public static void main(String[] args) {
        creditCard customerCard=creditCardBuilder.startBuilder().createCustomerCard(1,1,"tolga").build();
        creditCard companyCard=creditCardBuilder.startBuilder().createCompanyCard(1,1,"company").build();
        creditCard builderCard=creditCardBuilder.startBuilder().setId(2).setCustomerId(2).setCompanyId(2).setCompanyName("buildCompany").setCustomerName("buildCustomer").build();
        System.out.println(customerCard);
        System.out.println(companyCard);
        System.out.println(builderCard);
    }
}