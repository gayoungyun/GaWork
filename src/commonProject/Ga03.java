package commonProject;

import java.util.Scanner;

class Test_01{// 따라하기 but미완성
	private int temperature;

	public void setTemperature(int temp) {//자동완성아님
		temperature = temp;
	}

	public int getTemperature() {
		return temperature;
	}
	
}
public class Ga03 {
	public static void main(String[] args) {
		Test_01 t = new Test_01();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("에어컨 버튼 기능");
		System.out.println("1. 온도 올리기");
		System.out.println("2. 온도 내리기");
		int choice = sc.nextInt();
		
		if(choice ==1 ) {
			int currentTemp = t.getTemperature();
			t.setTemperature(currentTemp+1);
			System.out.println("온도가 1도 올랐습니다. 현재 온도 : "+t.getTemperature());
		}else if(choice == 2) {
			int currnetTemp = t.getTemperature();
			t.setTemperature(currnetTemp -1);
			System.out.println("온도가 1도 내려갔습니다. 현재 온도 : "+t.getTemperature());
		}else {
			System.out.println("잘못된 선택입니다");
		}
	}
	

}
