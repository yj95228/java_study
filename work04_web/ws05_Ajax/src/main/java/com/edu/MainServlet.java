package com.edu;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/main.do")
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String command = request.getParameter("command");
		System.out.println("Command: "+command);
		if(command.equals("wordCount")) {
			wordCount(request, response);
		}else if(command.equals("kickCount")) {
			kickCount(request, response);
		}
	}

	private void wordCount(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String words = request.getParameter("words");
		String result = new Count().execute(words);
		request.setAttribute("result", result);
		request.getRequestDispatcher("Result.jsp").forward(request, response);
	}
	
	private void kickCount(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fname = request.getParameter("fname");
		String path = request.getServletContext().getRealPath("/res");
		System.out.println("path: "+path);
		File f = new File(path, fname);
		int result = new Kickboard().execute(f);
		
		request.setAttribute("result", result);
		request.getRequestDispatcher("Result.jsp").forward(request, response);
	}
}
