package Collection.Lab;

public class KySu extends CanBo{
	
	private String Nganh;
	public KySu(String name, String date, boolean sex, String accress, String chucvu,String nganh) {
		super(name, date, sex, accress, chucvu);
		this.Nganh = nganh;
		// TODO Auto-generated constructor stub
	}

	

	public String getNganh() {
		return Nganh;
	}

	public void setNganh(String nganh) {
		this.Nganh = nganh;
	}
	
}
