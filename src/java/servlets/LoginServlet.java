/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import domainClasses.User;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 643699
 */
public class LoginServlet extends HttpServlet {



    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/loginpage.jsp").
                forward(request, response);
        
    }


   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
        
                       
        UserLogin userLogin = new UserLogin();
                
        if(password.isEmpty() || username.isEmpty()){
            request.setAttribute("message", "You must fill in all fields");
            getServletContext().getRequestDispatcher("/WEB-INF/loginpage.jsp").
                    forward(request, response);
        }
        
        User u = new User();
        u.setUsername(username);
        u.setPassword(password);    
        request.setAttribute("user", u);
        
        if(userLogin.login(u.getUsername(), u.getPassword())){
            request.setAttribute("mainUser", u.getUsername());
            getServletContext().getRequestDispatcher("/WEB-INF/mainpage.jsp").
                    forward(request, response);
        }
        
        
        request.setAttribute("message", "Wrong Username and/or Password");
             
        
        
        getServletContext().getRequestDispatcher("/WEB-INF/loginpage.jsp").
                    forward(request, response);
        
    }



}
