package ie.dit;

import processing.core.PApplet;

public class HelloProcessing extends PApplet
{	
	public void settings()
	{
		size(500, 500);
	}

	public void setup() {
	}

	public void draw() {
		// line(10, 10, 100, 100);		

		background(255, 0 , 0);

        fill(255, 255, 0);
        stroke(255, 255, 0);
        ellipse(250, 300, 400, 400);

        fill(0, 255, 255);
        stroke(0, 255, 255);
        triangle(250, 50, 50, 450, 450, 450);

        fill(220, 220, 220);
        stroke(220, 220, 220);
        ellipse(250, 250, 190, 85);

        fill(0, 0, 0);
        stroke(0, 0, 0);
        ellipse(250, 250, 65, 65);

	}	
}
