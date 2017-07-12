package cn.bjsxt.Util;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class MyFrame extends Frame {
	
	public void launchFrame(){     //窗口加载
		setSize(Constant.GAME_WIDTH,Constant.GAME_HEIGHT);
		setLocation(250,200);
		setVisible(true);       //窗口默认不可见
	
		new PaintThread().start();  // 启动一个线程
		
	addWindowListener(new WindowAdapter(){  //匿名内部类,窗口监听
		//重写
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
	}
	
	/**
	 * 定义一个重画窗口的线程类,是一个内部类
	 * @author wcq
	 *
	 */
	class PaintThread extends Thread{    //内部类,线程类
		public void run(){
			while(true){  //打印死循环,一直为true,
				repaint(); //调用外部的方法,
				try {
					Thread.sleep(50);  
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
