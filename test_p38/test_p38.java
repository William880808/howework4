package test_p38;

public class test_p38 {
	public static void main(String[] args) {
		ivehicle[] ivc;
		ivc = new ivehicle[2];
		
		ivc[0] = new car(12345, 20.5);
		ivc[1] = new plane(232);
		
		for(int i=0;i<ivc.length;i++) {
			ivc[i].show();
		}
	}
}

interface ivehicle{
	int weight = 1000;
	void show();
}

class car implements ivehicle{
	private int num;
	private double gas;
	
	public car(int n, double g) {
		num = n;
		gas = g;
		System.out.println("生產了車號為"+num+"，汽油量為"+gas+"的車子");
	}
	
	public void show() {
		System.out.println("車號為"+num);
		System.out.println("汽油量為"+gas);
		
	}
}
class plane implements ivehicle{
	private int flight;
	
	public plane(int f) {
		flight = f;
		System.out.println("生產了"+flight+"班次的飛機");
	}
	
	public void show() {
		System.out.println("飛機的班次為"+flight);
	}
}