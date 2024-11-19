package model;

public class Credit implements Payment {
    @Override
    public void method(Double amount) {
        System.out.println(amount + (amount*0.5));
    }
}
