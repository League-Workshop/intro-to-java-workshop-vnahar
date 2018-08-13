void setup() {
  size(3000, 3000);
}
void draw() {
  fill(#1D51DB);
  if (mousePressed)
    fill(#F70FC5);
  ellipse(600, 600, 600, 600);

  fill(#B412C6);
  if (mousePressed)
    fill(#0F49A5);
  ellipse(300, 300, 300, 300);
}