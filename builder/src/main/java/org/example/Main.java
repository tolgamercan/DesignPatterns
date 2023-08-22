package org.example;

public class Main {
    public static void main(String[] args) {
        creditCard customerCard=creditCardBuilder.createCustomerCard(1,1,"tolga").build();
        creditCard companyCard=creditCardBuilder.createCompanyCard(1,1,"company").build();
        System.out.println(customerCard);
        System.out.println(companyCard);

    }
}