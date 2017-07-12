package cn.bjsxt.Solar;

import java.awt.Graphics;
import java.awt.Image;

import cn.bjsxt.Util.Constant;
import cn.bjsxt.Util.GameUtil;
import cn.bjsxt.Util.MyFrame;

/**
 * 
 * @author wcq
 *
 */
public class SolarFrame extends MyFrame{
	
	Image bg = GameUtil.getImage("images/bg.jpg");
//	Image sun = GameUtil.getImage("images/sun.jpg");
	Star sun = new Star("images/sun.jpg",Constant.GAME_WIDTH/2,Constant.GAME_HEIGHT/2);
	Planet earth = new Planet("images/Earth.jpg",150,100,0.2,sun);
	//添加卫星
	Planet moon = new Planet("images/moon.jpg",20,10,0.3,earth,true);
	Planet mars = new Planet("images/Mars.jpg",180,120,0.12,sun);
	Planet mercury = new Planet("images/Mercury.jpg",100,60,0.5,sun);
	Planet venus = new Planet("images/Venus.jpg",120,80,0.4,sun);
	Planet jupiter = new Planet("images/Jupiter.jpg",230,150,0.08,sun);
	Planet saturn = new Planet("images/Saturn.jpg",300,170,0.06,sun);
	Planet uranus = new Planet("images/Uranus.jpg",340,200,0.03,sun);
	Planet neptune = new Planet("images/Neptune.jpg",380,230,0.01,sun);
	
	
	public void paint(Graphics g){
		g.drawImage(bg, 0, 0, null);
//		g.drawImage(sun, Constant.GAME_WIDTH/2, Constant.GAME_HEIGHT/2, null);
		sun.draw(g);
		earth.draw(g);
		mars.draw(g);
		mercury.draw(g);
		venus.draw(g);
		jupiter.draw(g);
		saturn.draw(g);
		uranus.draw(g);
		neptune.draw(g);
		
		moon.draw(g);
	}
	
	public static void main(String[] args){
		new SolarFrame().launchFrame();
	}
}
