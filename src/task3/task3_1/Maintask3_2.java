package task3.task3_1;

import java.util.ArrayList;

class GroceryItem{
    String name;
    int pricePerKg;

   public GroceryItem(String name, int pricePerKg){
      this.name = name;
      this.pricePerKg= pricePerKg;
   }
}
class GroceryCartItem extends GroceryItem{
    float price;
    float quantity;
    public GroceryCartItem(String name, int pricePerKg) {
        super(name, pricePerKg);
    }
    @Override
    public String toString(){
          return String.format("%s (₹%d X %.2fkg) = ₹%.1f", name, pricePerKg, this.quantity, this.price);
    }
    float extractQuantity(String quantityStr){
        String[] ItemWeight = quantityStr.split(" ");
        int[] weight = {Integer.parseInt(ItemWeight[0].replace("kg", "")), Integer.parseInt(ItemWeight[1].replace("g", ""))};
        double d = weight[0] + weight[1]*0.001;
        return (float) d;
    }
   static GroceryCartItem createNew(GroceryItem item, String quantityStr){
       GroceryCartItem cartItem = new GroceryCartItem(item.name, item.pricePerKg);
       cartItem.quantity = cartItem.extractQuantity(quantityStr);
       cartItem.price = cartItem.quantity* item.pricePerKg;
       return cartItem;
    }
}
class Cart{
    ArrayList<GroceryCartItem> cartItems;
    float totalAmount;
    public Cart() {
        cartItems = new ArrayList<>();
        totalAmount=0;
    }
   public Cart add(GroceryCartItem item){
        cartItems.add(item);
       totalAmount = totalAmount+ item.price;
        return this;
   }
   @Override
    public String toString(){
       StringBuilder sb = new StringBuilder();

       sb.append("Cart{" + "\n\tgroceryCartItems = {");
       for (GroceryCartItem cartItem : cartItems) {
           sb.append("\n\t" + cartItem.toString() + ",");
       }
       sb.append("\n\t" +
               "\ttotalAmount = ₹" + this.totalAmount +
               "}");
       return sb.toString();
   }

}
public class Maintask3_2 {
    public static void main(String[] args) {
        GroceryItem sugar = new GroceryItem("Sugar", 25);
        GroceryItem salt = new GroceryItem("Salt", 20);
        GroceryItem pulse = new GroceryItem("Pulse", 70);
        GroceryItem tea = new GroceryItem("tea", 190);

        Cart cart = new Cart();
        cart.add(GroceryCartItem.createNew(sugar, "5kg 0g"))
                .add(GroceryCartItem.createNew(salt, "3kg 500g"))
                .add(GroceryCartItem.createNew(pulse, "1kg 0g"))
                .add(GroceryCartItem.createNew(tea, "1kg 250g"));

        System.out.println(cart.toString());
    }
}
