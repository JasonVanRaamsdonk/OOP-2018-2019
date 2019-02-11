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

	/*
	public void draw() {
<<<<<<< HEAD
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

=======
		background(0, 0, 255);
		stroke(255, 0, 0);
		fill(255, 255, 0);
		line(10, 10, 100, 100);		// x1, y1, x2, y2
		point(50, 50); // x, y
		ellipse(100, 200, 50, 150); // cx, cy, w, h
		fill(0, 255, 0);
		rect(50, 10, 100, 200); // tlx, tly, w, h
		triangle(10, 10, 100, 90, 200, 200); // vertices	
>>>>>>> 881a2bd49e4bc7d1fb1442cb61f3c24db17f9269
	}	
	*/

	int x = 0; // 4 bytes
	int xx = 2;
	float f = 0.0f; // 4 bytes
	char c = 'h'; // Unicode
	String s = "Hello";
	boolean b = (1 == 0);
	double d = 0; // 8 bytes

	public void draw()
	{	
		
		background(0);
		noStroke();
		fill(255);
		ellipse(x, mouseY, 50, 50);		
		x ++;
	}
}
