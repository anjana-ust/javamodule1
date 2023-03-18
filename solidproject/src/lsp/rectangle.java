package lsp;

public class rectangle implements shape {
	private int length;
	private int breath;
	public rectangle() {
		// TODO Auto-generated constructor stub
	}
	
	public rectangle(int length, int breath) {
		super();
		this.length = length;
		this.breath = breath;
	}

	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getBreath() {
		return breath;
	}
	public void setBreath(int breath) {
		this.breath = breath;
	}
	@Override
	public int getArea() {
		// TODO Auto-generated method stub
		return this.length*this.breath;
	}
	

}
