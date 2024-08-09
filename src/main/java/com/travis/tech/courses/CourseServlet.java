package com.travis.tech.courses;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/courses")
public class CourseServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.getWriter().println("<h1>Welcome to Travis Tech IT Courses!</h1>");
        
        // Courses List
        resp.getWriter().println("<h2>Available Courses</h2>");
        resp.getWriter().println("<ul>");
        resp.getWriter().println("<li>Introduction to Cloud Computing</li>");
        resp.getWriter().println("<li>Basic Linux Knowledge</li>");
        resp.getWriter().println("<li>Advanced AWS Management</li>");
        resp.getWriter().println("<li>Database Management Systems</li>");
        resp.getWriter().println("<li>Cloud Computing Fundamentals</li>");
        resp.getWriter().println("<li>Cybersecurity Essentials</li>");
        resp.getWriter().println("<li>Data Science and Analytics</li>");
        resp.getWriter().println("<li>Machine Learning and AI</li>");
        resp.getWriter().println("<li>Software Engineering Principles</li>");
        resp.getWriter().println("<li>DevOps Practices and Tools</li>");
        resp.getWriter().println("</ul>");
        
        // Contact Information Section
        resp.getWriter().println("<h2>Contact Information</h2>");
        resp.getWriter().println("<p>If you have any questions or need further assistance, please contact us at:</p>");
        resp.getWriter().println("<p>Email: support@travis.tech</p>");
        resp.getWriter().println("<p>Phone: +1-800-555-TECH</p>");
        
        // Teachers Section
        resp.getWriter().println("<h2>Our Teachers</h2>");
        resp.getWriter().println("<ul>");
        resp.getWriter().println("<li>Engineer Travis</li>");
        resp.getWriter().println("<li>Prof. Lienge</li>");
        resp.getWriter().println("<li>Prof. Fonsah</li>");
        resp.getWriter().println("<li>Dr. Sam</li>");
        resp.getWriter().println("</ul>");
    }
}
