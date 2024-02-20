package commonProject;

import java.util.Scanner;

class a_온도{
	private int num, Up, Down, system, end, sum;
	public a_온도(int num, int Up, int Down, int system, int end, int sum) {
		this.num = num;
		this.Up = Up;
		this.Down = Down;
		this.system = system;
		this.end = end;
		this.sum = sum;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getUp() {
		return Up;
	}
	public void setUp(int up) {
		Up = up;
	}
	public int getDown() {
		return Down;
	}
	public void setDown(int down) {
		Down = down;
	}
	public int getSystem() {
		return system;
	}
	public void setSystem(int system) {
		this.system = system;
	}
	public int getEnd() {
		return end;
	}
	public void setEnd(int end) {
		this.end = end;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
}

public class Ga02 {
	Scanner input = new Scanner(System.in);
	a_온도 dto;
	int num;
	int temp = 20;
	
	public void display() {
		while(true) {
			System.out.println("1.온도 올림");
			System.out.println("2.온도 내림");
			System.out.println("3.종료 기능");
			System.out.println("<<<");
			num = input.nextInt();
			switch(num) {
			
			case 1 :
				System.out.println("온도를 올립니다");
				Up();
				break;
			case 2 :
				System.out.println("온도를 내립니다");
				Down();
				break;
			case 3 :
				System.out.println("종료합니다");
				end();
				break;
			}
		}
	}
	public void Up() {
		
		System.out.println("온도 올림 : "+ ++temp);
	}
	public void Down() {
		System.out.println("온도 내림 : "+ --temp);
	}
	public void end() {
		System.out.println("종료합니다");
	}

}
