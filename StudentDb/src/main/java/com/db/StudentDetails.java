package com.db;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@WebServlet("/StudentDetails")
public class StudentDetails extends HttpServlet {
	static Map<Integer,Student> stdmap=new HashMap<Integer,Student>();

    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String branch = request.getParameter("branch");
        

        PrintWriter out = response.getWriter();
        
        /*out.println("ID: " + id + "<br>");
        out.println("Name: " + name);*/
        
        
        Student std=new Student(id, name, email, branch);
        stdmap.put(id, std);
        out.print("Data added successfully-----");
        
    }
    
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	int id=Integer.parseInt(req.getParameter("id"));
    	
    	Student std=stdmap.get(id);
    	std.getId();
    	std.getName();
    	std.getEmail();
    	std.getBranch();
    	
    	PrintWriter out = resp.getWriter();
    	out.println("ID: " + std.getId());
        out.println("Name: " + std.getName());
        out.println("Email: " + std.getEmail());
        out.println("Branch: " + std.getBranch());
    }
}
