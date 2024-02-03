package entities;

public class Product {

    //DECLARAÇÃO DE ARGUMENTOS DO OBJETO
    private String name;
    private Double price;

    //MÉTODO CONSTRUTOR SEM ARGUMENTO
    public Product() {
    }

    //MÉTODO CONSTRUTOR COM ARGUEMENTOS
    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    //MÉTODOS GETTERS AND SETTERS

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    //MÉTODO FUNÇÃO
    public String priceTag() {

    }

}
