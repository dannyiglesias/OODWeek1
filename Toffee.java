class Toffee extends PieDecorator {
	Pie pie;
	
	public Toffee(Pie pie) {
		this.pie = pie;	
	}
	public String getDescription() {
		return pie.getDescription() + ", Toffee";
	}
	public double cost() {
		return pie.cost() + .59;
	}	
}
