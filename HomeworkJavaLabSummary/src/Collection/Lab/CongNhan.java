package Collection.Lab;

public class CongNhan extends CanBo {
	private String Bac;
	
	public String getBac() {
		return Bac;
	}

	public void setBac(String bac) {
		Bac = bac;
	}

	public CongNhan(String name, String date, boolean sex, String accress,String chucvu,String bac) {
		super(name, date, sex, accress,chucvu);
		this.Bac=bac;
		
		// TODO Auto-generated constructor stub
	}

}
