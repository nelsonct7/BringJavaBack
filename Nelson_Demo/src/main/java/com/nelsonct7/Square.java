package com.nelsonct7;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/sqr")
public class Square extends HttpServlet {

//    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws IOException {

        int k = (int) request.getAttribute("k");

        int sqr=k*k;

        response.setContentType("text/html");
        response.getWriter().println("<h2>Square of "+k+": " + sqr + "</h2>");
    }
}
