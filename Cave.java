import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.*;
public class Cave extends Applet implements KeyListener{
int imgxpos;
int imgypos;
map m;
public void paint(Graphics g)
{
g.drawImage(getImage(getCodeBase(), "Chair_skeleton.gif"), imgxpos, imgypos, 50,50, this);
g.drawString(""+imgxpos+", "+imgypos, 10, 20);
resize(1000,1000);

}
public void init(){
imgxpos=0;
imgypos=0;
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