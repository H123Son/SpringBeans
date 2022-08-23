package hunre.edu.dh9c;

public class msgHello {
	private String msg;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}


	public  void MsgOut() {
		System.out.print("This is greetting message: " + this.msg);
	}
}
