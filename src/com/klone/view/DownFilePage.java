package com.klone.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DownFilePage extends HttpServlet {


	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;Charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<html>");
			out.println("<head>");
				out.println("<h1 align='center'><font color=Olive face='MS Sans Serif'>Down Page</font></h1>");			
			out.println("</head>");	
			out.println("<body>");				
				out.println("<form action='/DownFiles/DownloadServlet' method='post'>");
				out.println("<input height='100' width='100' type='image' src='images/littlegirl.jpg' name='face' />");				
//				out.println("<button color='blue' type='button'>");
//				out.println("œ¬‘ÿ");			
//				out.println("</button>");					
				out.println("<input type='submit' value='µ«¬º'/></br>");			
				out.println("</form>");			
			out.println("</body>");			
		out.println("</html>");
	}


	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doGet(request, response);

	}

}
