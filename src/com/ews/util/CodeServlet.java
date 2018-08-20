package com.ews.util;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.image.codec.jpeg.ImageFormatException;
import com.sun.image.codec.jpeg.JPEGCodec;
import com.sun.image.codec.jpeg.JPEGImageEncoder;

public class CodeServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public CodeServlet() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {	
		String s = "";
		int intCount = 0;
		intCount = (new Random()).nextInt(9999);
		if (intCount < 1000)
			intCount += 1000;
		s = intCount + "";
		request.getSession().setAttribute("randomCode", s);
		response.setContentType("image/gif");
		ServletOutputStream out=null;
		try {
			out = response.getOutputStream();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		//在内存中创建图片
		   int width=60,height=20;
		   BufferedImage image=new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);
		 //获取图形上下文
		   Graphics gra = image.getGraphics();
		// 
		gra.setColor(new Color(160,200,100));
		gra.fillRect(0,0,width,height);
		   //设置字体
		gra.setFont(new Font("Times New Roman",Font.PLAIN,18));
		// 
		Random random= new Random();
		char c;
		for (int i = 0; i < 4; i++) {
			c = s.charAt(i);
			 gra.setColor(new Color(20+random.nextInt(110),20+random.nextInt(110),20+random.nextInt(110)));
			gra.drawString(c + "", 13*i+6,16);
		}
		JPEGImageEncoder encoder = JPEGCodec.createJPEGEncoder(out);
		try {
			encoder.encode(image);
			out.close();
		} catch (ImageFormatException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		///return null;
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out
				.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.println("<HTML>");
		out.println("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
		out.println("  <BODY>");
		out.print("    This is ");
		out.print(this.getClass());
		out.println(", using the POST method");
		out.println("  </BODY>");
		out.println("</HTML>");
		out.flush();
		out.close();
	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
