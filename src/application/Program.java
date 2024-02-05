package application;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //INSTANCIAÇÃO DO OBJETO DE FORMATAÇÃO DE DATA
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        //INSTANCIAÇÃO DE UMA LISTA DO OBJETO PRODUCT
        List<Product> list = new ArrayList<>();

        System.out.println("Enter the number of products: ");
        int numberOfProducts = sc.nextInt();
        sc.nextLine();

        for (int i=1; i<=numberOfProducts; i++) {
            System.out.printf("Product #%d data%n", i);
            System.out.println("Common, used or imported (c/u/i)?");
            String typeOfProduct = sc.nextLine();
            System.out.println("Name: ");
            String name = sc.nextLine();
            System.out.println("Price: ");
            double price = sc.nextDouble();
            sc.nextLine();

            //INSTANCIANDO UM OBJETO PRODUCT FORA DO SWITCH CASE
            Product product = null;

            switch (typeOfProduct) {
                case "c":
                    //INSTANCIANDO UM OBJETO PRODUCT
                    product = new Product(name, price);
                    break;

                case "i":
                    System.out.println("Customs fee:");
                    double customsFee = sc.nextDouble();
                    sc.nextLine();
                    //INSTANCIANDO UM OBJETO PRODUCT
                    product = new ImportedProduct(name, price, customsFee);
                    break;

                case "u":
                    System.out.println("Manufacture date:  (DD/MM/YYYY): ");
                    Date manufactureDate = sdf.parse(sc.nextLine());
                    //INSTANCIANDO UM OBJETO PRODUCT
                    product = new UsedProduct(name, price, manufactureDate);
                    break;
            }

            //ADICIONANDO UM OBJETO PRODUCT DENTRO DA LISTA
            list.add(product);
            }

        //IMPRESSÃO NA TELA DAS TAGS DOS PRODUTOS
        for (Product prod : list) {
            System.out.println(prod.priceTag());
        }
        sc.close();
    }
}
