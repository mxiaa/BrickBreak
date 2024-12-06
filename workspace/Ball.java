import java.awt.*;

public class Ball {
	//your code here!
	
	//don't forget you need instance variables:
	
	private int yPos;
	private int xPos;
	private int size;
	private int xVelocity;
	private int yVelocity;


	
	//constructor(s):
	public Ball  (int xPos, int yPos, int size){
		this.size = size;
		this.xPos = xPos;
		this.yPos = yPos;
		xVelocity = 1;
		yVelocity = -1;
	}

	
	//methods:

	public int getXpos() {
		return xPos;
	}

	public int getYpos() {
		return yPos;
	}

	public int getSize() {
		return size;
	}

	public int reverseY() {
		return yVelocity *=-1;
	}

	public void setXVelocity(int v) {
		this.xVelocity = v;
	}

	public void setYVelocity(int v) {
		this.yVelocity = v;
	}

	public int reverseX() {
		return xVelocity *=-1;
	}

	public void setX(int x) {
		this.xPos = x;
	}

	public void setY(int x) {
		this.yPos = x;
	}

	public void move() {
		xPos += xVelocity;
		yPos += yVelocity;
		
	}

	public void draw(Graphics g) {
		g.setColor(Color.pink);
		g.fillOval(xPos, yPos, size, size);
	}
}
