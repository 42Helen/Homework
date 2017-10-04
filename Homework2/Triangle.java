
public class Triangle {
	private int a;
	private int b;
	private int c;
	private int p;
	private int s;
	
	public Triangle(int a, int b, int c){
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	public int getP() {
		return p;
	}

	public void setP(int p) {
		this.p = p;
	}

	public int getS() {
		return s;
	}

	public void setS(int s) {
		this.s = s;
	}
	
	public void Area(){
		p = (a + b + c);
		p /= 2;
		s = p*((p - a))*(p - b)*(p - c);
		System.out.println(Math.sqrt(s));
	}

	public String toString() {
		return "Triangle [a=" + a + ", b=" + b + ", c=" + c + ", p=" + p
				+ ", s=" + s + "]";
	}
	
}

