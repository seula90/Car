package Car;

class Car {
	String name;
	int speed;
	static int numberOfCars; // numberOfCars는 전역변수
	
	public Car() {
		name = "My Car";
		speed = 0;
		numberOfCars++;
	}
	public void setName(String name) {
		name = name;
	}
	public void setSpeed(int s) {
		speed = s;
	}
	public int getSpeed() {
		return speed;
	}
}
