class Almonds extends PieDecorator {
	Pie pie;
	
	public Almonds(Pie pie) {
		this.pie = pie;	
	}
	public String getDescription() {
		return pie.getDescription() + ", Almonds";
	}
	public double cost() {
		return pie.cost() + 2.00;
	}	
}