//Abstract Pie class
//All classes extend from this
abstract class Pie {
	String description = "Unknown Pie";
	public String getDescription() {
		return description;
	}
	public abstract double cost();
}