package cn.bjsxt.Solar;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import cn.bjsxt.Util.GameUtil;

/**
 * 行星类
 * @author wcq
 *
 */
public class Planet extends Star{
	//Planet行星类除了继承Star类中的图片,坐标,还有绕着某个椭圆运行:长轴,短轴,以某个Star为中心飞
	 double longAxis;   //长轴
	 double shortAxis;  //短轴
	 double speed;      //飞行速度
	 double degree; //角度
	 Star center;       //飞行中心
	 boolean satelite;  //判断是否为行星的卫星
	
	//实现重画功能,两种方法,可以重写父类的draw方法,或者直接调用draw方法并且提供Planet的move()移动方法
	@Override
	public void draw(Graphics g) {
		super.draw(g);
		
//		//沿着椭圆轨迹飞行
//		x = (center.x + center.width) + longAxis*Math.cos(degree);
//		y = (center.y + center.height) + shortAxis*Math.sin(degree);
//		
//		degree += speed;
		//代码优化,一个方法尽量只做一件事,上面代码等同于
		if(!satelite){    //判断是否为卫星
			drawTrace(g);
		}
		move();
		
	
	}
	//画出行星运动的椭圆轨迹
	public void drawTrace(Graphics g){
		double ovalX,ovalY,ovalWidth,ovalHeight;
		
		ovalX = (center.x + center.width/2) - longAxis;
		ovalY =  (center.y + center.height/2) - shortAxis;
		ovalWidth = longAxis * 2;
		ovalHeight =  shortAxis * 2;
		
		Color c = g.getColor();
		g.setColor(Color.BLUE);
		g.drawOval((int)ovalX, (int)ovalY, (int)ovalWidth, (int)ovalHeight);
		g.setColor(c);
		
	}
	public void move(){
		//沿着椭圆轨迹飞行
		x = (center.x + center.width) + longAxis*Math.cos(degree);
		y = (center.y + center.height) + shortAxis*Math.sin(degree);
		
		degree += speed;
	}
	
	
	public Planet(String imgpath,double longAxis, double shortAxis, double speed, Star center) {
		super(GameUtil.getImage(imgpath));
		this.longAxis = longAxis;
		this.shortAxis = shortAxis;
		this.speed = speed;
		//传入中心的star
		this.center = center;
		this.x = center.x + longAxis; //求得起始行星的横坐标的位置
		this.y = center.y ;			  //求得行星起始纵坐标的位置
//		this.img = GameUtil.getImage(imgpath);
		
//		this.width = img.getWidth(null);
//		this.height = img.getHeight(null);
	}
	public Planet(String imgpath,double longAxis, double shortAxis, double speed, Star center,boolean satelite) {
//		super(GameUtil.getImage(imgpath));
//		this.longAxis = longAxis;
//		this.shortAxis = shortAxis;
//		this.speed = speed;
//		//传入中心的star
//		this.center = center;
//		this.x = center.x + longAxis; //求得起始行星的横坐标的位置
//		this.y = center.y ;			  //求得行星起始纵坐标的位置
		
		//代码优化等同于
		this(imgpath,longAxis,shortAxis,speed,center);   //多加入一个参数,调用上面的构造
		this.satelite = satelite;
	}


	public Planet(Image img, double x, double y) {
		super(img, x, y);
	}
	public Planet(String imgpath,double x,double y){
		super(imgpath,x,y);
	}
}












































