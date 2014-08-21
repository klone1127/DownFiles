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

		//���ط�����ʹ�õ�HTTPͷΪContent-Disposition
		response.setHeader("Content-Disposition","attachment;filename=littlegirl.jpg");
		
		//webվ�������ļ���ԭ��
		//1����ȡҪ���ص��ļ���ȫ·��
		String path = this.getServletContext().getRealPath("images/littlegirl.jpg");
//		System.out.println("path =" + path);
		//2�������ļ�����������ȡҪ���ص��ļ�
		
		FileInputStream fis = new FileInputStream(path);  
		byte[] buf = new byte[1024];
		int len = 0;//��ʾʵ�ʶ�ȡ�˶��ٸ��ֽ�
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
