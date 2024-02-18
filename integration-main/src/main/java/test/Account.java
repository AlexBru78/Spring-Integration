package test;

import org.springframework.messaging.Message;

public class Account {

    private String name;
    private Integer number;
    private Integer amount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String create(String name){
        System.out.println("---------------------created received:    " + name);
        return "Account created for " + name;
    }

    public String printString(Account account){
        String name = account.getName();
        System.out.println("---------------------printString received:    " + name);
        return "printString received: " + name;
    }

    public String printInteger(Account account){
        Integer number = account.getNumber();
        System.out.println("---------------------printInteger received:    " + number);
        return "printInteger received: " + number;
    }

    public String aggregate(String message){
        System.out.println("---------------------aggregate received:    " + message);
        return "aggregate received: " + message;
    }
}
