package bean;

public class Accountbean {
		private String uID;
		private String user;
		private String pass;
		private Long isAdmin;
		public Accountbean() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Accountbean(String uID, String user, String pass, Long isAdmin) {
			super();
			this.uID = uID;
			this.user = user;
			this.pass = pass;
			this.isAdmin = isAdmin;
		}
		public String getuID() {
			return uID;
		}
		public void setuID(String uID) {
			this.uID = uID;
		}
		public String getUser() {
			return user;
		}
		public void setUser(String user) {
			this.user = user;
		}
		public String getPass() {
			return pass;
		}
		public void setPass(String pass) {
			this.pass = pass;
		}
		public Long getIsAdmin() {
			return isAdmin;
		}
		public void setIsAdmin(Long isAdmin) {
			this.isAdmin = isAdmin;
		}
		
		
}
