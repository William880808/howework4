package test_p32;

public class test_p32 {
public static void main(String[] args) {
	
	vehicle[] vc;
	vc = new vehicle[2];
	
	vc[0] = new Car(1234, 20.5);
	vc[1] = new plane(232);
	
	for(int i=0;i<vc.length;i++) {
		if(vc[i] instanceof Car) {
			System.out.println("��"+(i+1)+"�Ӫ���OCar���O");
		}
		else {
			System.out.println("��"+(i+1)+"�Ӫ��󤣬OCar���O");
		}
	}
	
}
}

abstract class vehicle{
	protected int speed;
	public void setspeed(int s) {
		speed = s;
		System.out.println("�N�t�׳]��"+speed);
	}
	abstract void show();
}

class Car extends vehicle
{
	protected int num;
	protected double gas;
	
	public Car(int n, double g) {
		num = n;
		gas = g;
		System.out.println("�Ͳ��F������"+num+"�A�T�o�q��"+gas+"�����l");
	}
	
	public void show() {
		System.out.println("������"+num);
		System.out.println("�T�o�q��"+gas);
		System.out.println("�t�׬�"+speed);
	}
}

class plane extends vehicle{
	private int flight;
	
	public plane(int f) {
		flight = f;
		System.out.println("�Ͳ��F"+flight+"�Z��������");
	}
	
	public void show() {
		System.out.println("�������Z����"+flight);
		System.out.println("�t�׬�"+speed);
	}
}