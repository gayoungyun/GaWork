package commonProject;

import java.util.Scanner;

class remoteController implements GaInt05{
	
	public void windDir()
	{
		
	}
	public void tempSet()
	{
		
	}
	public void modeChange()
	{
		
	}
	public void display()
	{
		
	}
	
	
	public void powerOn() {
		System.out.println("리모컨으로 켭니다");
	}
	public void powerOff() {
		System.out.println("리모컨으로 끕니다 ");
	}
}

class airconditional implements GaInt05{//새로 인터페이스 공간을 만든다
	private String wind, mode;
	private int temp;

	public void powerOn() {//오버라이드
		
	}
	public void powerOff() {
		
	}
	public void windDir()
	{
		
	}
	public void tempSet()
	{
		
	}
	public void modeChange()
	{
		
	}
	public void display()
	{
		
	}
	
	
	public String getWind() {
		return wind;
	}

	public void setWind(String wind) {
		this.wind = wind;
	}

	public int getTemp() {
		return temp;
	}

	public void setTemp(int temp) {
		this.temp = temp;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}
}

public class Ga05 implements GaInt05{
	Scanner sc = new Scanner(System.in);
	airconditional air = new airconditional();

	public void windDir() {
		int wi;
		while(true) {
			System.out.println("상하 방향 : 양수입력");
			System.out.println("좌우 방향 : 음수입력");
			wi = sc.nextInt();
			if(wi >0 ) {
				air.setWind("String");
				System.out.println("에어컨 상하방향 작동");
			}else if(wi<0) {
				air.setMode("String");
				System.out.println("에어컨 좌우방향 작동");
			}
			break;
		}
	}
	public void tempSet() {
		airconditional air = new airconditional();
		int currentTemp = air.getTemp();
		int desireTemp = air.getTemp();

		//setTemp(getTemp()+1);
		//if( isOn == true)
		air.setTemp(currentTemp);
		System.out.print("현재 온도 입력 : ");
		currentTemp = sc.nextInt();
		System.out.print("원하는 온도 입력 : ");
		desireTemp = sc.nextInt();
		air.setTemp(desireTemp- currentTemp);
		//int tempDiff= desireTemp -currentTemp;

		if(air.getTemp()>0) {
			System.out.println("온도를 올렸을 때"+air.getTemp()+"도 올랐습니다");
		}else if(air.getTemp()<0) {
			System.out.println("온도를 내렸을때"+air.getTemp()+"도 내려갔습니다");
		}else {
			System.out.println("현제 온도와 원하는 온도가 같습니다");
		}
	}
	public void modeChange() {
		airconditional air = new airconditional();
		int num;

		while(true) {
			System.out.println("1. 난방으로 설정");
			System.out.println("2. 볼륨설정");
			System.out.println("3. 재습 설정");
			System.out.println("4. 종료");
			num = sc.nextInt();
			switch(num ){
			case 1 : 
				System.out.println("난방으로 설정하겠습니다");
				break;
			case 2 :
				System.out.println("볼륨설정으로 설정됩니다");
				break;
			case 3 :
				System.out.println("재습으로 설정하겠습니다");
				break;
			case 4 :
				System.out.println("모드 변경을 종료하겠습니다");
				air.getMode();
				return;
			}
		}
	}
	public void display() {
		remoteController remote = new remoteController();
		airconditional air = new airconditional();
		Scanner sc = new Scanner(System.in);
		int choose;

		System.out.println("에어컨 리모컨으로 먼저 작동하세요 (1번 : 작동, 2번 : 종료)");
		choose = sc.nextInt();

		if(choose == 1) {
			remote.powerOn();
		}else if(choose == 2) {
			remote.powerOff();
			return;
		}else
			System.out.println("다시 선택해주세요");
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
				//if(num == air.getMode(num)) {
					//remote.powerOff();
					//return;
				}
				//break;
			
			
			}
		
		}
		
	public void powerOn() {// 오버라이드 모든 클래스마다 개수맞추고 메인에서 이름 잘 확인하기
		System.out.println("리모컨으로 켭니다");
	}
	public void powerOff() {
		System.out.println("리모컨으로 끕니다 ");
	}
	
	}














