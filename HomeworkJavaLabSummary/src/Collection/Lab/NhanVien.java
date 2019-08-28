package Collection.Lab;

public class NhanVien extends CanBo {
	private String Job;
	public NhanVien(String name, String date, boolean sex, String accress,String chucvu, String job) {
		super(name, date, sex, accress,chucvu);
		this.Job=job;
		// TODO Auto-generated constructor stub
	}
	public String getJob() {
		return Job;
	}
	public void setJob(String job) {
		Job = job;
	}
	
	
}
