void setup() {
	size(500, 500);
  println("Left or right click to draw a rectangle. Press any key to reset the background.")
  background(255);
}
void mousePressed(){
  stroke(0)
  fill(mouseX,mouseY,0)
  rect(mouseX,mouseY,mouseX,mouseY)
}
void keyPressed(){
  background(255);
}