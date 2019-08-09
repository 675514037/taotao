package com.zhiyou100.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.SocketException;

import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;

public class FtpUtil {
	
	//ftp的上传  
	
	public void upload(InputStream inputStream,String fileName) throws SocketException, IOException{
		//1.实例化ftpclient
				FTPClient ftpClient=new FTPClient();
				//2.连接服务器
				ftpClient.connect("192.168.181.69");
				//3.登陆服务器  输入账号密码
				ftpClient.login("fandaozhuang", "250");
				//4.准备要上传 的本地文件
				//FileInputStream inputStream=new FileInputStream("D://MM.jpg");
				//5.上传文件
				//5.1 确定上传位置     该用户的位置
				ftpClient.changeWorkingDirectory("/home/fandaozhuang/images");
				//5.2 设置文件的类型
				ftpClient.setFileType(FTPClient.BINARY_FILE_TYPE);
				//5.3 上传
									//(文件名，本地的输入流)
				ftpClient.storeFile(fileName, inputStream);

				//6.关闭
				ftpClient.logout();
		
	}
	
	
	
	
	//main
	public static void main(String[] args) throws SocketException, IOException {
		/**
		 * vsftp是配置好的   url  username  password  
		 * 要上传的文件   --- 要上传到哪个位置
		 */
		//1.实例化ftpclient
		FTPClient ftpClient=new FTPClient();
		//2.连接服务器
		ftpClient.connect("192.168.0.72");
		//3.登陆服务器  输入账号密码
		ftpClient.login("fdz", "root");
		//4.准备要上传 的本地文件
		FileInputStream inputStream=new FileInputStream("D://mm.jpg");
		//5.上传文件
		//5.1 确定上传位置     该用户的位置
		ftpClient.changeWorkingDirectory("/home/user1/www");
		//5.2 设置文件的类型
		ftpClient.setFileType(FTPClient.BINARY_FILE_TYPE);
		//5.3 上传
							//(文件名，本地的输入流)
		ftpClient.storeFile("hh.jpg", inputStream);

		//6.关闭
		ftpClient.logout();
		
	}
}
