package view;

import model.Product;
import model.SaleItem;
import model.Sale;

public class Main {
    public static void main(String[] args) {

        Sale sale = new Sale();
        sale.createSaleItem("at",2);
        sale.createSaleItem("ff",1);
        sale.createSaleItem("ms",2);


        for(Object item :sale.getItems())
            System.out.println(item);
        System.out.println(String.format("Total: %.2f",
                sale.getTotal()));

//        Product rice = new Product();
//        rice.setDescription("Arroz Tatiana");
//        rice.setPrice(30);
//
//        Product beans = new Product();
//        beans.setDescription("Fijão Feijó");
//        beans.setPrice(20);
//
//        Product pasta = new Product();
//        pasta.setDescription("Macarrão Santa Amália");
//        pasta.setPrice(15);
//
//        SaleItem itemRice = new SaleItem();
//        itemRice.setProduct(rice);
//        itemRice.setQuantity(2);
//
//        SaleItem itemBeans = new SaleItem();
//        itemBeans.setProduct(beans);
//        itemBeans.setQuantity(1);
//
//        SaleItem itemPasta = new SaleItem();
//        itemPasta.setProduct(pasta);
//        itemPasta.setQuantity(6);
//
//        Sale sale = new Sale();
//        sale.addSaleItem(itemRice);
//        sale.addSaleItem(itemBeans);
//        sale.addSaleItem(itemPasta);

 //       for (SaleItem item : sale.getItems())
   //         System.out.println(item);

     //   System.out.println(String.format("Total: %.2f",
       //         sale.getTotal()));
    }
}
