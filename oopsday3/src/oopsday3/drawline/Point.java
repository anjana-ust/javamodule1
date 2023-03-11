package oopsday3.drawline;

public class Point implements DrawIface {
	int x;
	int y;

	public Point() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}



	public int getX() {
		return x;
	}



	public void setX(int x) {
		this.x = x;
	}



	public int getY() {
		return y;
	}



	public void setY(int y) {
		this.y = y;
	}



	@Override
	public void drawLine(Point x,Point y) {
		
		for(int i=x.getX();i<y.getY();i++)
		
			System.out.println(".");
		
		
		
	}

}
