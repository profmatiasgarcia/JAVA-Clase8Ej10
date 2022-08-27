/**
 * @author Prof Matias Garcia.
 * <p> Copyright (C) 2022 para <a href = "https://www.profmatiasgarcia.com.ar/"> www.profmatiasgarcia.com.ar </a>
 * - con licencia GNU GPL3.
 * <p> Este programa es software libre. Puede redistribuirlo y/o modificarlo bajo los términos de la
 * Licencia Pública General de GNU según es publicada por la Free Software Foundation, 
 * bien con la versión 3 de dicha Licencia o bien (según su elección) con cualquier versión posterior. 
 * Este programa se distribuye con la esperanza de que sea útil, pero SIN NINGUNA GARANTÍA, 
 * incluso sin la garantía MERCANTIL implícita o sin garantizar la CONVENIENCIA PARA UN PROPÓSITO
 * PARTICULAR. Véase la Licencia Pública General de GNU para más detalles.
 * Debería haber recibido una copia de la Licencia Pública General junto con este programa. 
 * Si no ha sido así ingrese a <a href = "http://www.gnu.org/licenses/"> GNU org </a>
 **/
package Controllers;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.Map;

public class ShowLoginServlet extends HttpServlet {

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
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ShowLoginServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ShowLoginServlet at " + request.getContextPath() + "</h1>");
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
        /* Get values to show. */
        Map errors = (Map) request.getAttribute("errors");
        String loginName = "";
        String loginNameErrorMessage = "";
        if (errors != null) {
            String errorHeader = "<font color=\"red\"><b>";
            String errorFooter = "</b></font>";
            if (errors.containsKey("loginName")) {
                loginName = request.getParameter("loginName");
                loginNameErrorMessage = errorHeader + errors.get("loginName") + errorFooter;
            }
        }
        /* Generate response. */
        response.setContentType("text/html; charset=ISO-8859-1");
        PrintWriter out = response.getWriter();
        /* Header and begin of body. */
        out.println("<html><head>");
        out.println("<title>Formulario de Login</title>");
        out.println("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx\" crossorigin=\"anonymous\">\n"
                + "</head>");
        out.println("<body>");
        out.println("<div class=\"bg-primary\">");

        out.println("    <nav class=\"navbar navbar-expand-lg bg-secondary fixed-top\" id=\"mainNav\">\n"
                + "        <div class=\"container\">\n"
                + "            <a class=\"navbar-brand js-scroll-trigger\" href=\"https://www.profmatiasgarcia.com.ar\">www.profmatiasgarcia.com.ar</a>\n"
                + "            <button class=\"navbar-toggler navbar-toggler-right font-weight-bold bg-primary text-white rounded\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarResponsive\" aria-controls=\"navbarResponsive\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">Menu <i class=\"fas fa-bars\"></i></button>\n"
                + "            <div class=\"collapse navbar-collapse\" id=\"navbarResponsive\">\n"
                + "                <ul class=\"navbar-nav ms-auto\">\n"
                + "                    <li class=\"nav-item mx-0 mx-lg-1\"><a class=\"nav-link py-3 px-0 px-lg-3 rounded js-scroll-trigger\" href=\"MainPageServlet\">Iniciar Sesion</a>\n"
                + "                    </li>\n"
                + "                </ul>\n"
                + "            </div>\n"
                + "        </div>\n"
                + "    </nav>");

        out.println("<div class=\"container\">\n"
                + "        <div class=\"row\">\n"
                + "            <div class=\"col-md-4 offset-md-4\">\n"
                + "                <div class=\"login-form bg-light mt-5 p-5\">\n"
                + "                    <form action=\"ProcessLoginServlet\" method=\"POST\" class=\"row g-3\">\n"
                + "                        <br><br><br>\n"
                + "                        <h4>Inicie sesion</h4>\n"
                + "                        <div class=\"col-12\">\n"
                + "                            <label>Username</label>\n"
                + "                            <input type=\"text\" name=\"loginName\" class=\"form-control\" placeholder=\"Username\" value=\"" + loginName + "\">" + loginNameErrorMessage + "\n"
                + "                        </div>\n"
                + "                        <div class=\"col-12\">\n"
                + "                            <label>Password</label>\n"
                + "                            <input type=\"password\" name=\"loginPass\" class=\"form-control\" placeholder=\"Password\">\n"
                + "                        </div>\n"
                + "                        <div class=\"col-12\">\n"
                + "                            <button type=\"submit\" class=\"btn btn-dark float-end\">Login</button>\n"
                + "                        </div>\n"
                + "                    </form>\n"
                + "                    <hr class=\"mt-4\">\n"
                + "                </div>\n"
                + "            </div>\n"
                + "        </div>\n"
                + "    </div>"
                + "    <br><br><br>");

        out.println("</div>");
        out.println("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa\" crossorigin=\"anonymous\"></script>");
        out.println("</body></html>");

        out.close();
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
        doGet(request, response);
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