package task3.task3_1;

class Product {
    String name;
    int price;
    public Product() {
    }

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }
    @Override
    public String toString(){
        return String.format("Name : %s @ Rs. %d ",name,price);
    }
    @Override
    public boolean equals(Object obj){
        if(obj == this){
            return true;
        }
        if(!(obj instanceof Product)){
            return false;
        }
        Product product = (Product) obj;
        return name.equals(product.name);
    }
}

class SpecialProduct extends Product{
    int regularPrice ;
    int percentageOff;
    public SpecialProduct(String name , int price){
        super(name, price);
    }
    public String toString(){
        return String.format("Regular Price : %d & Discounted Price : %d", regularPrice, price);
    }
    public static SpecialProduct applyOffOnProduct(Product product, int percentageOff){
        int discountPrice = product.price - product.price * percentageOff / 100;
        SpecialProduct specialProduct = new SpecialProduct(product.name, discountPrice);
        specialProduct.regularPrice = product.price;
        specialProduct.percentageOff = percentageOff;
        return specialProduct;
    }
}

public class MainTask3_1 {
    public static void main(String[] args) {
        Product Chocolate = new Product("Kitkat", 100);
        Product Chocolate1 = new Product("DairyMilk", 100);
        Product Chocolate2 = new Product("Kitkat", 80);

        System.out.println(Chocolate.toString());
        System.out.println(Chocolate1.toString());
        System.out.println(Chocolate2.toString());

        System.out.println("The equality of Chocolate and Chocolate2 is " + Chocolate.equals(Chocolate2));

        SpecialProduct specialProduct = SpecialProduct.applyOffOnProduct(Chocolate, 20);
        System.out.println(specialProduct.toString());
    }
}
