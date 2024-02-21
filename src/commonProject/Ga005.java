package commonProject;

import java.util.Random;
import java.util.Scanner;

class remoteControl {
	private int numset, soundset;
	private String exinput;

	public int getNumset() {
		return numset;
	}
	public void setNumset(int numset) {
		this.numset = numset;
	}
	public int getSoundset() {
		return soundset;
	}
	public void setSoundset(int soundset) {
		this.soundset = soundset;
	}
	public String getExinput() {
		return exinput;
	}
	public void setExinput(String exinput) {
		this.exinput = exinput;
	}
	//public class Ga005{

	public void powerOn() {
		System.out.println("리모컨으로 켭니다");
	}
	public void powerOff() {
		System.out.println("리모컨으로 끕니다 ");
	}
	public void numSetting() {
		Scanner sc = new Scanner(System.in);
		remoteControl rc = new remoteControl();
		int num;
		int cho = 0;
		int i = 0;
		String up, down;

		while(true) {
			System.out.println("1. 번호 설정");
			System.out.println("2. 볼륨설정");
			System.out.println("3. 외부입력설정");
			num = sc.nextInt();
			if(num == 1) {
				while(true) {
					System.out.println("1 번호 입력");
					System.out.println("2 한단계씩 올리고 내리기");
					System.out.println("3 나가기");
					num= sc.nextInt();
					switch(num) {
					case 1 :
						if (cho<=999 && cho >=0) {
							rc.setNumset(cho);
							System.out.println("번호를 입력해주세요");
							cho = sc.nextInt();
						}else if(cho>999 || cho <0){
							System.out.println("없는 번호입니다");
						}break;

					case 2 :
						System.out.println("현재 번호 : "+cho+" 에서 up또는 down입력 ");
						String numm = sc.next();
						rc.setNumset(cho);
						//rc.getNumset();
						if(cho>999||cho<1) {
							System.out.println("없는 번호입니다");
							cho = sc.nextInt();
							if (rc.equals("up")) {
								System.out.println( ++i+"로 변경");
							}else if(rc.equals("down")) {
								System.out.println(cho+ --i+"로 변경");
							}
						}else {
							break;
						}
					case 3 :
						System.out.println("나가기");
						break;
					}
				}
			}
		}
	}
	public void soundSetting() {
		Scanner sc = new Scanner(System.in);
		remoteControl rc = new remoteControl();
		int num;
		int cho = 0;
		int i = 0;
		String up, down;

		while(true) {
			System.out.println("1. 번호 설정");
			System.out.println("2. 볼륨설정");
			System.out.println("3. 외부입력설정");
			num = sc.nextInt();

			if(num == 2) {
				while(true) {
					System.out.println("1 숫자 입력");
					System.out.println("2 한단계씩 올리고 내리기");
					System.out.println("3 음소거, 나가기");
					num= sc.nextInt();
					switch(num) {
					case 1 :
						if(cho>100 || cho <0) {
							//rc.setNumset(cho);
							System.out.println("다시 입력해주세요");
						}else if(cho<=100 && cho >=0){
							rc.setNumset(cho);
							System.out.println("볼륨을 입력해주세요");
							cho = sc.nextInt();
						}

					case 2 :
						System.out.println("한단계 올리고 내리기 숫자입력");
						num = sc.nextInt();
						if(num>100) {
							System.out.println("최대볼륨은 100입니다");
							num = sc.nextInt();
						}else if(num<0){
							System.out.println("최소볼륨은 0입니다");
						}else if(rc.equals("up")){
							System.out.println("증가 : "+num+ ++i);
							rc.setNumset(num);
						}else if(rc.equals("down")) {
							System.out.println("감소 : "+num+ --i);
							rc.setNumset(num);
						}else {
							System.out.println("다시 입력해주세요");
						}
					case 3 :
						System.out.println("나가기");
						return;
					}
				}
			}
		}
	}

	public void exinputSetting() {
		Scanner sc = new Scanner(System.in);
		remoteControl rc = new remoteControl();
		int num;
		int cho = 0;
		int i = 0;
		String up, down;

		while(true) {
			System.out.println("1. 번호 설정");
			System.out.println("2. 볼륨설정");
			System.out.println("3. 외부입력설정");
			num = sc.nextInt();

			if(num == 3) {
				Random rd = new Random();
				//int num1, num2;
				int random_num1 = rd.nextInt();
				int random_num2 = rd.nextInt();
				rc.setExinput("HDMI");
				rc.setExinput("USB");
				rc.setExinput("TV");
				System.out.println(rc.getExinput()+"HDMI가 연결되어있습니다");
				System.out.println(rc.getExinput()+"USB가 연결되어있습니다");
				System.out.println(rc.getExinput()+"TV가 연결되어있습니다");

				System.out.println(random_num1+" 케이블 신호가 없습니다. 다시 시도해주세요");
				System.out.println(random_num2+" 연결되었습니다. 외부입력 송출을 시작합니다");

			}
		}

	}
}
class aircondition{//새로 인터페이스 공간을 만든다
	private String wind, mode;
	private int temp;

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


public class Ga005{
	Scanner sc = new Scanner(System.in);
	aircondition air = new aircondition();

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
		aircondition air = new aircondition();
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
		aircondition air = new aircondition();
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
		remoteControl remote = new remoteControl();
		aircondition air = new aircondition();
		Scanner sc = new Scanner(System.in);
		int choose;

		System.out.println("에어컨 리모컨으로 먼저 작동하세요");
		System.out.println(">>>");
		System.out.println("1:작동, 2:종료, 3:번호설정, 4.볼륨설정, 5.외부입력설정");
		choose = sc.nextInt();

		if(choose == 1) {
			remote.powerOn();
		}else if(choose == 2) {
			remote.powerOff();
			return;
		}else if(choose ==3) {
			remote.numSetting();
		}else if(choose == 4) {
			remote.soundSetting();
		}else if(choose == 5) {
			remote.exinputSetting();
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
}


