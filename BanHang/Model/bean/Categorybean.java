package bean;

public class Categorybean {
	private String cid;
	private String cname;
	public Categorybean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Categorybean(String cid, String cname) {
		super();
		this.cid = cid;
		this.cname = cname;
	}
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	
}
