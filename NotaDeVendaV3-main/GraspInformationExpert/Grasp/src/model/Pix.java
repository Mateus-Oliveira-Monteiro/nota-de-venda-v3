package model;

public class Pix implements Payment{
    @Override
    public void method(Double amount) {
        System.out.println(amount - (amount*0.5));
    }
}
