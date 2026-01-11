package com.nelsonct7;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/add")
public class Calculator extends HttpServlet {

//    private static final long serialVersionUID = 1L;

    // when we want to define the Post, Put, Delete methods, the http servelet class has methods for it, use the appropriate one matched with each of the request like, 
    // doPost, doGet...etc
    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws IOException, ServletException {

        int a = Integer.parseInt(request.getParameter("num1"));
        int b = Integer.parseInt(request.getParameter("num2"));

        int sum = a + b;
        // to call one servelet from another one, we can use two methods
        // 1.request dispatcher and 2.request redirect
        // when we want to share data between two servelet we normally do with session management.
        // for easy we can set the atribute in the request object
        request.setAttribute("k", sum);
        RequestDispatcher rd=request.getRequestDispatcher("/sqr");
        rd.forward(request, response);
        
//        response.sendRedirect("sqr?k=" + sum);
//
//        response.setContentType("text/html");
//        response.getWriter().println("<h2>Result: " + sum + "</h2>");
    }
}