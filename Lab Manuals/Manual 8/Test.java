     public class Test {
    
         public static void main(String[] args)
	{
		
        BestForCustomer ob1=new BestForCustomer(10, 25, 15);
        
		/*
		PercentageDiscount p1=new PercentageDiscount(10);
        ThresholdDiscount p2=new ThresholdDiscount(25, 15);

        System.out.println("Percentage Discount: " + p1.discountedPrice(50));
        System.out.println("Threshold Discount: " + p2.discountedPrice(50));
        */
		 

        double value = ob1.discountedPrice(50);
        System.out.println("Best Price: "+ value);

    }  
    }