package com.klone.controller;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DownloadServlet extends HttpServlet {


	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");

		//下载方法所使用的HTTP头为Content-Disposition
		response.setHeader("Content-Disposition","attachment;filename=littlegirl.jpg");
		
		//web站点下载文件的原理
		//1、获取要下载的文件的全路径
		String path = this.getServletContext().getRealPath("images/littlegirl.jpg");
//		System.out.println("path =" + path);
		//2、创建文件输入流，读取要下载的文件
		
		FileInputStream fis = new FileInputStream(path);  
		byte[] buf = new byte[1024];
		int len = 0;//表示实际读取了多少个字节
		OutputStream os = response.getOutputStream();
		while((len=fis.read(buf))>0){
			os.write(buf, 0, len);
		}
		os.close();
		fis.close();
	}


	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doGet(request, response);

	}

}
