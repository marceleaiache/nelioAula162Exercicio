package entities;

import java.util.Date;

public class UsedProduct extends Product {

    //DECLARAÇÃO DE ARGUMENTOS
    private Date manufactureDate;

    //MÉTODO CONSTRUTOR SEM ARGUMENTOS
    public UsedProduct(Date manufactureDate) {
        super();
        this.manufactureDate = manufactureDate;
    }

    //MÉTODO CONSTRUTOR COM ARGUEMENTOS
    public UsedProduct(String name, Double price, Date manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    //MÉTODOS GETTERS AND SETTERS
    public Date getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    //MÉTODO FUNÇÃO
    @Override
    public String priceTag() {
        priceTag() = priceTag();
    }


}
