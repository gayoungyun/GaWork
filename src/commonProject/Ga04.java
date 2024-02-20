package commonProject;

import java.util.Scanner;

public class Ga04 {//따라하기, 실행X
	private int temperature;
	private boolean isOn = false;
	private int option = 0;
	
	public int getTemperature() {
		return temperature;
	}
	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}
	public boolean isOn() {
		return isOn;
	}
	public void setOn(boolean isOn) {
		this.isOn = isOn;
	}
	public int getOption() {
		return option;
	}
	public void setOption(int option) {
		this.option = option;
	}
	public void display() {
		Ga04 air = new Ga04();
		int airOption;
		
		while(air.getOption() != 5) {
			airOption = air.chooseOption();
			air.doOption(option);
			//air.turnOn();
			//air.turnOff();
			
		}
		System.out.println("이전으로 이동합니다");
	}
	
	public int chooseOption() {
		Scanner sc = new Scanner(System.in);
		System.out.println("<<<기능선택>>>");
		System.out.println("1. 전원 켜기");
		System.out.println("2. 전원 끄기");
		System.out.println("3. 온도 올리기");
		System.out.println("4. 온도 내리기");
		System.out.println("5. 이전으로");
		System.out.println("번호를 입력하세요 >>> ");
		option = sc.nextInt();
		return option;
		
	}
	public void doOption(int option) {
		if(option == 1) choose1();
		else if(option ==2) choose2();
		else if(option ==3) choose3();
		else if(option ==4) choose4();
	}
	public void choose1() {
		if(isOn == false)turnOn();
		else System.out.println("에어컨이 이미 켜져있습니다");
		System.out.println();
	}
	public void choose2() {
		if(isOn == true) turnOff();
		else System.out.println("에어컨이 이미 꺼져있습니다");
		System.out.println();
	}
	public void choose3() {
		if(isOn == true) {
			System.out.println("현재 온도를 1도 올립니다");
			setTemperature(getTemperature()+1);
			System.out.println("현재 온도 : "+getTemperature());
			System.out.println();
		}
		else System.out.println("에어컨을 먼저 켜주세요");
	}
	public void choose4() {
		if(isOn == true) {
			System.out.println("현재 온도를 1도 내립니다");
			setTemperature(getTemperature()-1);
			System.out.println("현제 온도 : "+getTemperature());
			System.out.println();
		}
	}
	public void turnOn() {
		System.out.println("에어컨을 켭니다");
		isOn = true;
		temperature = 25;
		System.out.println("기본 설정 온도 : "+getTemperature());
	}
	public void turnOff() {
		System.out.println("에어컨을 끕니다");
		isOn= false;
	}

}
