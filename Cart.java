package shopping;

import java.util.ArrayList;

public class Cart{
    public int id;
    public int cartTotal;
    Product prod = new Product();
    ArrayList<Product> cartList = new ArrayList<>();

    public void addToCart(Product prod){
        this.prod=prod;
        this.cartTotal = this.cartTotal+ this.prod.price;
        cartList.add(this.prod);
		System.out.println("product added to card sucessfully");	
    }

    public void display(){
        for(int i = 0; i < cartList.size(); i++) {
            System.out.println("id :"+cartList.get(i).id+"\n product name is : " + cartList.get(i).name + " "+ "\n brand: "+cartList.get(i).brand + "\n quantity :" + cartList.get(i).qty +"\n price :" + cartList.get(i).price);
            System.out.println();
           }
        System.out.println(" cart total is "+ cartTotal);
    }
}