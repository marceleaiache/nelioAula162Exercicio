package entities;

public class ImportedProduct extends Product {

    //DECLARAÇÃO DE ARGUMENTO ALÉM DA SUPERCLASS
    private Double customsFee;

    //MÉTODOS CONSTRUTORES SEM ARGUMENTO
    public ImportedProduct() {
        super();
    }

    //MÉTODOS CONSTRUTORES COM ARGUMENTOS
    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    //MÉTODOS GETTERS AND SETTERS
    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }

    //SOBREPONDO O MÉTODO DA SUPERCLASS PRODUCT
    @Override
    public String priceTag() {
        return getName()
                + " $ "
                + String.format("%.2f", totalPrice())
                + " (Customs fee: $ "
                + String.format("%.2f", customsFee)
                + ")";
    }

    //MÉTODO FUNÇÃO
    public double totalPrice() {
        return getPrice() + customsFee;
    }

}
