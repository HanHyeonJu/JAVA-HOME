package application;
//���� Ŭ����
public class Account {
	
	private String anum; //���¹�ȣ
	private String apassword; //���º�й�ȣ
	private int money; //�ܾ�

	public Account() {
		
	}
	
	public Account(String anum, String apassword) {

		this.anum = anum;
		anum = null;
		this.apassword = apassword;
		apassword = null;
		
	}
	
	public boolean correct(String anum, String apassword) { // ���¹�ȣ�� ���� ��й�ȣ ��ΰ� ���� ��� true �ƴ� ��� false�� return�� �޼ҵ� �ʿ�
		boolean cvalue = false;
		if(this.anum.equals(anum) && this.apassword.equals(apassword)) {
			cvalue = true;
		}
		return cvalue;
	}
	
	// ����� �Ŀ� ������ ������ �����ֱ� ���� �޼ҵ�
	public void accountdisplay() { 
		System.out.println("���¹�ȣ : " + anum);
		System.out.println("�ܾ� : " + this.money);
	}
	
	// �Ա� �޼ҵ�	
	public void plus(int Pmoney){ 
		money += Pmoney;
	}
	
	// ��� �޼ҵ�
	public void minus(int Mmoney){
		money -= Mmoney;
	}
	
	
	public String getAnum() {
		return anum;
	}

	public void setAnum(String anum) {
		this.anum = anum;
	}
	
	public String getApassword() {
		return apassword;
	}

	public void setApassword(String apassword) {
		this.apassword = apassword;
	}
	
	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}



}