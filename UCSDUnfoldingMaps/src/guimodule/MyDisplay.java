package guimodule;

import processing.core.PApplet;

public class MyDisplay extends PApplet {
	
public void setup(){
		
	size(400,400);
	background(200, 20,20);
	}

	public void draw(){
		
		fill(255,255,0);
		ellipse(200,200,390,390);
		fill(0,0,0);
		ellipse(120,150,50,70);
		ellipse(280,150,50,70);
		
		noFill();
		arc(200,280,120,95,PI/4,3*PI/4);
		
	}
	
	
	
}
