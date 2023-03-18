package lsp;

public  class Lspdemo {
	public void calculateArea(shape s) {
		System.out.println(s.getArea());
	}

	public static void main(String[] args) {
		Lspdemo lsp =new Lspdemo();
		lsp.calculateArea(new rectangle (1,4));

	}

}
