package fr.univ_lyon1.info.m1.balleauprisonnier_fx;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public class GraphicBall implements BallInterface {
	private Ball ball;
	private GraphicsContext gc;
	private Image image;

	public GraphicBall(GraphicsContext gc, Ball ball) {
		this.ball = ball;
		this.image = new Image("assets/ball.png");
		this.gc = gc;
		this.display();
	}
	@Override
	public void move() {
		this.ball.move();
		
	}

	@Override
	public boolean isStopped() {
		return this.ball.isStopped();
	}

	@Override
	public Position getPosition() {
		return this.ball.getPosition();
	}
	
	public void display() {
		this.gc.drawImage(this.image, this.ball.getPosition().getX(), this.ball.getPosition().getY());
	}

}
