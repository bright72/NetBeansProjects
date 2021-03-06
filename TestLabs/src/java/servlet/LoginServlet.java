/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import EntityClass.Account;
import JpaEntityClass.AccountJpaController;
import java.io.IOException;
import java.io.PrintWriter;
import javax.annotation.Resource;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.transaction.UserTransaction;

/**
 *
 * @author harit
 */
public class LoginServlet extends HttpServlet {

    @PersistenceUnit(unitName = "TestLabsPU")
    EntityManagerFactory emf;
    @Resource
    UserTransaction utx;

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
//        HttpSession session = request.getSession(true);
//        String idtext = request.getParameter("id");
//        String pintext = request.getParameter("pin");
//
//        if (idtext != null && pintext != null) {
//
//            int id = Integer.parseInt(idtext);
//            int pin = Integer.parseInt(pintext);
//
//            AccountJpaController acjpa = new AccountJpaController(utx, emf);
//            Account account = acjpa.findAccount(id);
//            if (account != null) {
//
//                if (account.getPin() == pin) {
//                    session.setAttribute("account", account);
//                    getServletContext().getRequestDispatcher("/MyAccount.jsp").forward(request, response);
//                } else {
//                    session.setAttribute("message", "pin wrong");
//                    getServletContext().getRequestDispatcher("/Login.jsp").forward(request, response);
//
//                }
//            } else {
//                session.setAttribute("message", "id wrong");
//                getServletContext().getRequestDispatcher("/Login.jsp").forward(request, response);
//            }
//        } else {
//            session.setAttribute("message", "plese input id and password");
//            getServletContext().getRequestDispatcher("/Login.jsp").forward(request, response);
//        }

       HttpSession session = request.getSession(true);
       if(session.getAttribute("account")!=null){
       
       
       }
        String idText = request.getParameter("id");
        String pinText = request.getParameter("pin");
        if(idText != null && pinText !=null){
            int id = Integer.parseInt(idText);
            int pin = Integer.parseInt(pinText);
            String loginmessage = null;
            AccountJpaController aCtrl = new AccountJpaController(utx, emf);
            Account account = aCtrl.findAccount(id);
            if(account != null){
                if(account.getPin()==pin){
                    session.setAttribute("account", account);
                    getServletContext().getRequestDispatcher("/MyAccount.jsp").forward(request, response);
                }else{
                     loginmessage = "Pin Invalid !";
                }
            }else{
                loginmessage = "Account Id Invalid !";
            }
            request.setAttribute("message", loginmessage);
        }
        getServletContext().getRequestDispatcher("/Login.jsp").forward(request, response);


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
