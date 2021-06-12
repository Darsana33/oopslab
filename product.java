

import java.util.Scanner;

class product
{
    int pcode, i, n,price;
    String pname;
    public static void main(String args[]) {
		 
        product p1 = new product();
        product p2 = new product();
        product p3 = new product();

		System.out.println("Enter the first product details:\n");
		p1.input();
		System.out.println("Enter the second product details:\n");
		p2.input();
		System.out.println("Enter the third product details:\n");
		p3.input();
		
		if(p1.price<p2.price && p1.price<p3.price)
			{
				System.out.println("\n "+p1.price+" is smallest price");
				p1.display();
			}
		else if(p2.price<p3.price)
			{
				System.out.println("\n "+p2.price+" is smallest price");
				p2.display();
			}
		else 
			{
				System.out.println("\n "+p3.price+" is smallest price");
				p3.display();
			}
	
	 }
	
     void input() {
		Scanner sc = new Scanner(System.in);
        	
		    System.out.println("Enter product code: ");
			pcode = sc.nextInt();
			
			System.out.println("Enter product price: ");
			price = sc.nextInt();
			
			System.out.println("Enter product name: ");
			pname = sc.next();   
      
    }
	void display()
		{
			System.out.println("\n DETAILS OF SMALLEST PRODUCT \n");	
			System.out.println("product code : " + pcode);
			System.out.println("product name : " + pname);
			
		}

}
