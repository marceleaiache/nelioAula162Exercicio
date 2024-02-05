package entities;

import java.text.SimpleDateFormat;
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

    //SOBREPONDO O MÉTODO DA SUPERCLASS PRODUCT
    @Override
    public String priceTag() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return getName() + " (used) $ "
                + String.format("%.2f", getPrice())
                + " (Manufacture date: "
                + sdf.format(manufactureDate)
                + ")";
    }
}
