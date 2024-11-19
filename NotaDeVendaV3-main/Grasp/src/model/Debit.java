    package model;

    public class Debit implements Payment {


        @Override
        public void method(Double amount) {
            System.out.println(amount);

        }
    }
