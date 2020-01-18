class Chocolate extends PieDecorator {
	Pie pie;
	
	public Chocolate(Pie pie) {
		this.pie = pie;	
	}
	public String getDescription() {
		return pie.getDescription() + ", Chocolate";
	}
	public double cost() {
		return pie.cost() + 1.00;
	}	
}