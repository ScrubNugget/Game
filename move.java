public class move{
private int v=25;
private int xpos;
private int ypos;

public void up(){
	ypos=ypos-v;
}
public void left(){
	xpos=xpos-v;
}
public void right(){
	xpos=xpos+v;
}
public void down(){
	ypos=ypos+v;
}
}