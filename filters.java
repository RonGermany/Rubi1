/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.FilterModel;

/**
 *
 * @author Jess
 */
public class filters extends HttpServlet {

    public filters(){
        super();
    }
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, InstantiationException, IllegalAccessException, SQLException {
        
        FilterModel fm = new FilterModel();
        
        String level1 = request.getParameter("level1");
        String level2 = request.getParameter("level2");
        String level3 = request.getParameter("level3");
        String chartType = request.getParameter("charts");
        request.setAttribute("sensor", level1);
        request.setAttribute("xaxis", level2);
        request.setAttribute("yaxis", level3);
        
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            //fm.getSensorData(level1, level2, level3);
            switch (chartType) {
                case "Line":
                    request.getRequestDispatcher("filter.jsp").forward(request, response);
                    break;
                case "Bar":
                    response.sendRedirect("filter2.jsp");
                    break;
                default:
                    response.sendRedirect("filter3.jsp");
                    break;
            }
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (InstantiationException | IllegalAccessException | SQLException ex) {
            Logger.getLogger(filters.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (InstantiationException | IllegalAccessException | SQLException ex) {
            Logger.getLogger(filters.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
