package Collection.Lab;

public class CanBo {
	private String name;
	private String date;
	private boolean sex;
	private String accress;
	private String chucvu;
	public CanBo(String name, String date, boolean sex, String accress,String chucvu) {
		super();
		this.name = name;
		this.date = date;
		this.sex = sex;
		this.accress = accress;
		this.chucvu=chucvu;
	}
	public String getChucvu() {
		return chucvu;
	}
	public void setChucvu(String chucvu) {
		this.chucvu = chucvu;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public boolean isSex() {
		return sex;
	}
	public void setSex(boolean sex) {
		this.sex = sex;
	}
	public String getAccress() {
		return accress;
	}
	public void setAccress(String accress) {
		this.accress = accress;
	}
	
}
