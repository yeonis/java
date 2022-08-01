package fffor;

public class Hero {

	String name;
	int power;
	int speed;
	
	Hero(String n, int p, int s) {
		name = n;
		power = p;
		speed = s;
	}
	
	String toStr() {
		return String.format("Hero(name: %s, power: %d, speed: %d}", name, power, speed);
	}
}
