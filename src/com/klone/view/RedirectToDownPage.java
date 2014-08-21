package com.klone.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RedirectToDownPage extends HttpServlet {


	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;Charset=utf-8");
		//用HTTP头Refresh延时5S跳转到DownFilePage
		response.setHeader("Refresh","5;/DownFiles/DownFilePage");
		PrintWriter out = response.getWriter();
		out.println("<h1 align='center'><font face='Comic Sans MS'>Will Redirect To DownLoad Page After 5S</font></h1>");
		//使用sendRedirect跳转DownFilePage
//		response.sendRedirect("/DownFiles/DownFilePage");
		
	}


	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doGet(request, response);

	}

}
