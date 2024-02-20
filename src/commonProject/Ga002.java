package commonProject;

public class Ga002 {//따라하기 미완성
	private int temp = 20;

	public int getTemp() {
		return temp;
	}

	public void setTemp(int temp) {
		this.temp = temp;
	}
	
	public void nowtemp() {
		System.out.println("현재 온도는 "+temp+"입니다");
	}
	public void uptemp() {
		temp++;
	}
	public void downtemp() {
		temp--;
	}
	

}
