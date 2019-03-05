import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.*;
import java.awt.Color;
public class Cave extends Applet implements KeyListener{
int imgxpos;
int imgypos;
int bx;
int by;
map m=new map();
public void paint(Graphics g)
{
g.drawImage(getImage(getCodeBase(), "Chair_skeleton.gif"), imgxpos, imgypos, 50,50, this);
g.drawString(""+imgxpos+", "+imgypos, 10, 20);
resize(1000,1000);
setBackground(Color.gray);
g.fillRect(0, 0, 1000, 1000);
for (int x=0; x<20; x++){
	for (int y=0; y<20; y++){
		if (m.get(x, y)==1){
			g.setColor(Color.red);
			g.fillRect(bx, by, bx+50, by+50);
		}
		if (m.get(x, y)==2){
			g.setColor(Color.blue);
			g.fillRect(bx, by, bx+50, by+50);
		}
		if (m.get(x, y)==3){
			g.setColor(Color.yellow);
			g.fillRect(bx, by, bx+50, by+50);
		}
		if (m.get(x, y)==4){
			g.setColor(Color.darkGray);
			g.fillRect(bx, by, bx+50, by+50);
		}





		by=by+50;
	}
	bx=bx+50;
}
}

public void init(){
m=new map();
imgxpos=0;
imgypos=0;
bx=0;
by=0;
addKeyListener(this);

}
public void keyPressed(KeyEvent e){
if(e.getKeyCode()==37){
boolean b=m.West();
if (b==true)
	imgxpos=imgxpos-50;// Left Arrow=37
}
if(e.getKeyCode()==38){
boolean b=m.North();
if (b==true)
	imgypos=imgypos-50;// Up Arrow=38
}
if(e.getKeyCode()==39){
boolean b=m.East();
if (b==true)
	imgxpos=imgxpos+50;// Right Arrow=39
}
if(e.getKeyCode()==40){
boolean b=m.South();
if (b==true)
	imgypos=imgypos+50;// Down Arrow=40
}
repaint();
}
public void keyTyped(KeyEvent e){}
public void keyReleased(KeyEvent e){}
}