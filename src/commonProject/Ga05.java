package commonProject;

import java.util.Scanner;

class airconditional{
	private String wind, temp, mode;
	//private boolean isOn = false;
	/*
	public boolean isOn() {
		return isOn;
	}
	public void setOn(boolean isOn) {
		this.isOn = isOn;
	}
	 */
	public String getWind() {
		return wind;
	}

	public void setWind(String wind) {
		this.wind = wind;
	}

	public String getTemp() {
		return temp;
	}

	public void setTemp(String temp) {
		this.temp = temp;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}
}
public class Ga05 {
	Scanner sc = new Scanner(System.in);
	airconditional air = new airconditional();

	public void windDir() {
		int wi;
		while(true) {
			System.out.println("상하 방향 : 양수입력");
			System.out.println("좌우 방향 : 음수입력");
			wi = sc.nextInt();
			if(wi >0 ) {
				System.out.println("에어컨 상하방향 작동");
			}else if(wi<0) {
				System.out.println("에어컨 좌우방향 작동");
			}
			break;
		}
	}
	public void tempSet() {
		//setTemp(getTemp()+1);
		//if( isOn == true)
		System.out.print("현재 온도 입력 : ");
		int currentTemp = sc.nextInt();
		System.out.print("원하는 온도 입력 : ");
		int desireTemp = sc.nextInt();
		int tempDiff= desireTemp -currentTemp;

		if(tempDiff>0) {
			System.out.println("온도를 올렸을 때"+tempDiff+"도 올랐습니다");
		}else if(tempDiff<0) {
			System.out.println("온도를 내렸을때"+tempDiff+"도 내려갔습니다");
		}else {
			System.out.println("현제 온도와 원하는 온도가 같습니다");
		}
	}
	public void modeChange() {
		int num;

		while(true) {
			System.out.println("1. 난방으로 설정");
			System.out.println("2. 볼륨설정");
			System.out.println("3. 재습 설정");
			num = sc.nextInt();
		}
	}
	public void display() {

		while(true) {
			System.out.println("1. 풍향설정");
			System.out.println("2. 온도설정");
			System.out.println("3. 모드변경");
			int num = sc.nextInt();
			switch(num) {
			case 1 :
				System.out.println("풍향설정을 시작합니다");
				windDir();
				break;
			case 2 :
				System.out.println("온도를 조절합니다");
				tempSet();
				break;
			case 3 :
				System.out.println("모드를 변경합니다");
				modeChange();
				break;

			}

		}
	}

}












