package cn.bjsxt.Util;

import java.awt.Image;
import java.awt.Toolkit;
/**
 * 游戏开发中常用的工具类,比如加载的图片等方法
 * @author wcq
 *
 */

public class GameUtil {
	
	private GameUtil(){}   //将构造方法私有,外部不能调用了,只让外部调用getImage()方法
	
//	public static Image getImage(String path){
//		URL u = GameUtil.class.getClassLoader().getResource(path);
//		BufferedImage img = null;
//		try{
//			img = ImageIO.read(u);
//		}catch(IOException e){
//			e.printStackTrace();
//		}	
//		return img	
//	}
	
	public static Image getImage(String path){
		return Toolkit.getDefaultToolkit().getImage(GameUtil.class.getClassLoader().getResource(path));
	}
}


















