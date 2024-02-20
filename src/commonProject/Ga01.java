package commonProject;

import java.util.Scanner;

class Tv01{
	private String power, sound, channel;
	public Tv01(String power, String sound, String channel) {
		this.power = power;
		this.sound = sound;
		this.channel = channel;
	}

	public String getPower() {
		return power;
	}

	public void setPower(String power) {
		this.power = power;
	}

	public String getSound() {
		return sound;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}


}
public class Ga01 {
	Scanner input = new Scanner(System.in);
	Tv01 dto;
	int num;
	int j= 1;
	int i =1;
	//Tv01 t = new Tv01();
	public void display() {

		while(true) {
			System.out.println("1. power on/off");
			System.out.println("2. sound up/down");
			System.out.println("3. channel up/down");
			System.out.println("<<<");
			num= input.nextInt();
			switch(num) {

			case 1 :
				System.out.println("power on/off");
				power();
				break;

			case 2 : 
				System.out.println("sound up/down");
				sound();
				break;

			case 3 :
				System.out.println("channel up/down");
				channel();
				break;
			}
		}

	}
	/*
	public void inputData() {
		Scanner input = new Scanner(System.in);

		while(true) {
			System.out.println("1. power on/off");
			System.out.println("2. sound up/down");
			System.out.println("3. channel up/down");
			System.out.println("<<<");
			num = input.nextInt();
		}
	}
	 */
	public void power(){
		while(true) {
			System.out.println("Tv on또는off 입력해주세요");
			String pow = input.next();
			if(pow.equals("on")) {
				System.out.println("전원을 킵니다");
			}else if(pow.equals("off")) {
				System.out.println("전원을 끕니다");
			}else {
				System.out.println("버튼을 다시 눌러주세요");
			}
		}
	}
	public void sound() {

		while(true) {

			System.out.println("sound up또는down 입력해주세요");
			String son = input.next();
			if(son != null)
				if(son.equals("up")) {
					System.out.println("sound up : "+ ++i);
				}else if(son.equals("down")) {
					System.out.println("sound down : "+ --i);
				}else {
					System.out.println("버튼을 다시 눌러주세요");
				}
			break;
		}

	}
	public void channel() {

		while(true) {
			System.out.println("channel up또는down 입력해주세요");
			String cha = input.next();
			//dto.setChannel(input.next());
			//dto.setChannel("up");
			//dto.setChannel("down");
			if(cha != null)
				if(cha.equals(cha)) {
					System.out.println(j);
					System.out.println("channel : "+ ++j);
					System.out.println(j);
				}else if(cha.equals(cha)) {
					System.out.println("channel : "+ --j);
				}else {
					System.out.println("버튼을 다시 눌러주세요");
				}//else
			//	System.out.println("종료");
			break;
		}

	}
}






