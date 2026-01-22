package com.api.testing;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/sumofDigits")

public class sumofDigits extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public sumofDigits() {
        super();
    }

    // Handle POST request
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        int num = Integer.parseInt(request.getParameter("number"));
        int sum = 0;
        int temp = Math.abs(num);

        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }

        out.println("<html><body>");
        out.println("<h2>Sum of Digits</h2>");
        out.println("Number: " + num + "<br>");
        out.println("Sum of Digits: " + sum);
        out.println("</body></html>");
    }
}
