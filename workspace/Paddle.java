import java.awt.*;


//
//  Class author:  Mia Magone
//  Date created:  12/4/2024
//  General description: This class creates and desribes the paddle the player will control to play the game
//

public class Paddle {

	//your code here!
	
	//don't forget you need instance variables:
	
	private int yPos;
	private int xPos;
	private int width;
	private int height;
	private int velocity;
	
	//constructor(s):
	public Paddle (int xPos, int yPos, int width, int height){
		this.width = width;
		this.height = height;
		this.xPos = xPos;
		this.yPos = yPos;
	}
	//methods:


//precondition: g is not null
//postcondition: the white paddle is drawn according to where the player moved it
	public void draw(Graphics g) {
		g.setColor(Color.red);
		g.fillRect(xPos, yPos, width, height);
	}

	public int getX() {
		return xPos;
	}

	public int getWidth() {
		return width;
	}

	public int getY() {
		return yPos;
	}

	public int getHeight() {
		return height;
	}
	
	public int getVelocity() {
		return velocity;
	}

	public void setX(int x) {
		this.xPos = x;
	}

	public void setVelocity(int v) {
		this.velocity = v;
	}

	public void move() {
		xPos += velocity;
		if(velocity >0){
			velocity --;
		}
		if(velocity <0){
			velocity ++;
		}
		if (xPos < 0){
			xPos = 0;
		}
		if (xPos > 600){
			xPos = 600;
		}
	}

	public void addVelocity(int v) {
		velocity += v;
		if (velocity > 5){
			velocity --;
		}
	}
		
	}
