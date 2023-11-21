/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author gdhan
 */
@WebServlet(urlPatterns = {"/pbiodata"})
public class pbiodata extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */ 
            out.println("<html>");
            out.println("<head>");
            out.println("<title>1 HTML to Servlet Communication</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>BioData</h1>");
            
            String name = request.getParameter("name");
            out.println( "Name: " + name +"<br><br>");
            
            int mark = Integer.parseInt(request.getParameter("mark"));
            out.println("Mark Percentage: " + mark +"<br><br>");
            
            String gender = request.getParameter("gen");
            out.println("Gender: "+ gender +"<br><br>");
            
            String language1 = request.getParameter("lang1");
            String language2 = request.getParameter("lang2");
            String language3 = request.getParameter("lang3");
            boolean c1 = request.getParameter("lang1")!=null;
            boolean c2 = request.getParameter("lang2")!=null;
            boolean c3 = request.getParameter("lang3")!=null;
            out.println("Languages Known:");
            if(c1==true){
            out.println(language1 + ",");
            }
            if(c2==true){
            out.println(language2 + ",");
            }
            if(c3==true){
            out.println(language3);
            }
            out.println("</body>");
            out.println("</html>");
            
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
