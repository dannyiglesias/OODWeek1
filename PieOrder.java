//Driver class and method
class PieOrder {
	public static void main(String args[]) {
		
		System.out.println("Thank you for your custom pie order at Dannys Pies! Your order included:");
		Pie pie = new Apple();
		System.out.println(pie.getDescription()
				+ " $" + pie.cost());
		
		Pie pie2 = new Pecan();
		pie2 = new Chocolate(pie2);
		pie2 = new Toffee(pie2);
		pie2 = new Almonds(pie2);
		System.out.println(pie2.getDescription()
				+ " $" + pie2.cost());
		
		Pie pie3 = new Cherry();
		pie3 = new Chocolate(pie3);
		pie3 = new Almonds(pie3);
		System.out.println(pie3.getDescription()
				+ "  $" + pie3.cost());
		
		double pieTotal = pie.cost() + pie2.cost() + pie3.cost();
		System.out.println("The total for this order comes out to $" + pieTotal); 
	}
}