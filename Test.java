package shopping;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
		
		Customer cust = new Customer("sheldon","sheldon@yahoomail.com","12956783");
		Scanner sc = new Scanner(System.in);
		Cart cart = new Cart();
		
		Product[] prod = new Product[3];
		
		prod[0] = new Product(1,"monitor","dell",5,5000);
		prod[1] = new Product(2,"mouse","hp",5,500);
		prod[2] = new Product(3,"keyboard","dell",5,2000);

		int opt =1;
		while(opt == 1) {
		    System.out.println( "List of products available are ");
		    System.out.println();
            
		    for(int i=0;i<3;i++) {
		    	prod[i].display();
            
		    }
		    int ch = sc.nextInt();
		    switch (ch){
		    case 1: cart.addToCart(prod[0]);
		            break;

		    case 2: cart.addToCart(prod[1]);
              		break;
            
		    case 3: cart.addToCart(prod[2]);
       	    		break;
            
            default :
            	     System.out.println("sorry something wrong");
            	     break;
		    }
        
		    System.out.println("press 1 to add more product to cart");
		    opt = sc.nextInt();
		}
		
	    System.out.println("Details from cart are shown below");
        cart.display();
        
		sc.close();
	}
}
