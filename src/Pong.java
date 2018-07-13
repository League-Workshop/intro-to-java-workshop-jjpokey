/*
int x = 500;
int xSpeed = 5;
int y = 400;
int ySpeed = 5;
int paddleY = 700;
int paddleW = 200;
int paddleH = 50;
void setup() {
  size(1000, 800);
}

void draw() {
  //background
  background(0, 0, 0);
  //paddle
  rect(mouseX, paddleY, paddleW, paddleH);
  //lose
  rect(0,780,1000,20);
  //circle
  ellipse(x, y, 50, 50);
  fill(255, 255, 255);
  stroke(000, 255, 000);
  
 
  x += xSpeed;
  y += ySpeed;
  if (x > width) {
    xSpeed = -xSpeed;
  }
  if (x < 0) {
    xSpeed = -xSpeed;
  }
  if (y > height) {
   exit();
  }
  if (y < 0) {
    ySpeed = -ySpeed;
  }
  if(intersects(x, y + 35, mouseX, paddleY, paddleW)) {
    ySpeed = -ySpeed;
  }
}
boolean intersects(int ballX, int ballY, int paddleX, int paddleY, 
  int paddleLength) {
  if (ballY > paddleY && ballX > paddleX && ballX < paddleX + paddleLength)
    return true;
  else
    return false;
}
*/


