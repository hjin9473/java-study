package sec01.exam02;

public class Board {
	String s;
	String t;
	String r;
	public Board(String s, String t, String r) {
		super();
		this.s = s;
		this.t = t;
		this.r = r;
	}
	public String getS() {
		return s;
	}
	public void setS(String s) {
		this.s = s;
	}
	public String getT() {
		return t;
	}
	public void setT(String t) {
		this.t = t;
	}
	public String getR() {
		return r;
	}
	public void setR(String r) {
		this.r = r;
	}
	@Override
	public String toString() {
		return "Board [s=" + s + ", t=" + t + ", r=" + r + "]";
	}
	
	
}
