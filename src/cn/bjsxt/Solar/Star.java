package cn.bjsxt.Solar;

import java.awt.Graphics;
import java.awt.Image;

import cn.bjsxt.Util.GameUtil;

/**
 * 封装star类,将星球封装起来
 * 恒星类
 * @author wcq
 *
 */
public class Star {
	//一个星星所拥有的属性是有图片,还有位置
     Image img;
	 double x,y;
	 int width,height;  //Star图片的宽度和高度
	
	//空构造器
	public Star(){ 
		
	}
	public Star(Image img){
		this.img = img;
		this.width = img.getWidth(null);
		this.height = img.getHeight(null);
	}
	//构造函数
	public Star(Image img,double x, double y){
//		this.img = img;
//		this.x = x;
//		this.y = y;
//		
//		this.width = img.getWidth(null); //等于图片的宽度
//		this.height = img.getWidth(null); //等于图片的高度
		
		/*增加了Star(img)构造方法后,可以将上面代码优化为等同于下面*/
		this(img);
		this.x = x;
		this.y = y;
	}
	//重载构造函数
	public Star(String imgpath,double x,double y){
	
//		this.img = GameUtil.getImage(imgpath);
//		this.x = x;
//		this.y = y;	
//		this.width = img.getWidth(null); //等于图片的宽度
//		this.height = img.getWidth(null); //等于图片的高度
//      等同于	
		this(GameUtil.getImage(imgpath),x,y);  //通过this关键字调用同类中的另外一个构造方法
	}
	
	//调用paint方法,实现重画功能
	public void draw(Graphics g){
		g.drawImage(img, (int)x,(int) y, null);
	}
}





