package com.zhiyou100.util;

import java.util.Random;

public class IDUtils {
	/*
	 * 图片名生成
	 */
	public static String getImageName() {
		//取时间的长整型值包含毫秒
		long millis =System.currentTimeMillis();
		//long.millis =System.nanoTime();
		//加上三位随机数
		Random random =new Random();
		int end3 =random.nextInt(999);
		//如果不足三位前面补0
		String str =millis + String.format("%03d", end3);
		
		return str;
	}
	/*
	 * 生成商品id
	 */
	public static long genItemId() {
		//取当前时间的长整形包含毫秒
		long millis =System.currentTimeMillis();
		//加上2位随机数
		Random random =new Random();
		int end2 =random.nextInt(99);
		//如果不足三位前面补0
		String str =millis + String.format("%02d", end2);
		long id=new Long(str);
		return id;
		
	}
}
