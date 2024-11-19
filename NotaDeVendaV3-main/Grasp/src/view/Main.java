package view;

import model.Product;
import model.SaleItem;
import model.Sale;
2

import model.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criar a venda e adicionar itens
        Sale sale = new Sale();
        sale.createSaleItem("at", 2); // 2 unidades de Arroz
        sale.createSaleItem("ff", 1); // 1 unidade de Feijão
        sale.createSaleItem("ms", 2); // 2 unidades de Macarrão
w
        // Exibir os itens da venda
        System.out.println("Itens da Venda:");
        for (String item : sale.getItems()) {
            System.out.println(item);
        }
        double total = sale.getTotal();
        System.out.printf("Total (sem ajustes): %.2f%n", total);

        // Escolha da forma de pagamento
        System.out.println("\nEscolha a forma de pagamento:");
        System.out.println("1 - Cartão de Crédito (5% de juros)");
        System.out.println("2 - Cartão de Débito (sem juros)");
        System.out.println("3 - Dinheiro/Pix (5% de desconto)");

        int paymentOption = scanner.nextInt();
        Payment paymentMethod;

        // Aplicar a forma de pagamento
        switch (paymentOption) {
            case 1:
                paymentMethod = new Credit();
                break;
            case 2:
                paymentMethod = new Debit();
                break;
            case 3:
                paymentMethod = new Pix();
                break;
            default:
                System.out.println("Opção inválida! Usando Débito como padrão.");
                paymentMethod = new Debit();
        }

        // Exibir nota de venda
        System.out.println("\n--- Nota de Venda ---");
        for (String item : sale.getItems()) {
            System.out.println(item);
        }
        System.out.printf("Total (sem ajustes): %.2f%n", total);

        System.out.print("Forma de Pagamento: ");
        switch (paymentOption) {
            case 1:
                System.out.println("Cartão de Crédito");
                break;
            case 2:
                System.out.println("Cartão de Débito");
                break;
            case 3:
                System.out.println("Dinheiro/Pix");
                break;
        }

        System.out.print("Valor Final a Pagar: ");
        paymentMethod.method(total);
    }
}

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


