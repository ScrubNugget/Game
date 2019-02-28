import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.*;
public class Cave extends Applet implements KeyListener{
int imgxpos;
int imgypos;
public void paint(Graphics g)
{
g.drawImage(getImage(getCodeBase(), ""), imgxpos, imgypos, 50,50, this);
g.drawString(""+imgxpos+", "+imgypos, 10, 20);
resize(600,600);

}
public void init(){
imgxpos=0;
imgypos=0;
addKeyListener(this);

}
public void keyPressed(KeyEvent e){
if(e.getKeyCode()==37) imgxpos=imgxpos-5;// Left Arrow=37
if(e.getKeyCode()==38) imgypos=imgypos-5;// Up Arrow=38
if(e.getKeyCode()==39) imgxpos=imgxpos+5;// Right Arrow=39
if(e.getKeyCode()==40) imgypos=imgypos+5;// Down Arrow=40
repaint();
if (imgypos<=0)
	imgypos=0;
if (imgxpos<=0)
	imgxpos=0;

if (imgypos>=500)
	imgypos=500;
if (imgxpos>=500)
	imgxpos=500;
}
public void keyTyped(KeyEvent e){}
public void keyReleased(KeyEvent e){}
}