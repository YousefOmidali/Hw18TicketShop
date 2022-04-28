package com.example.hw18_ticketshop;

import java.io.*;
import java.sql.SQLException;

import Entity.Ticket;
import Service.TicketService;
import Service.TravelService;
import Service.UserService;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import lombok.var;

@WebServlet("/")
public class HelloServlet extends HttpServlet {

    public void init() {

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        doGet(request, response);
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        String action = request.getServletPath();

        try {
            switch (action) {
//                case "/new":
//                    showNewForm(request, response);
//                    break;
//                case "/insert":
//                    insertUser(request, response);
//                    break;
                case "/buy":
                    buy(request, response);
                    break;
                case "/signup":
                    signUp(request, response);
                    break;
                case "/login":
                    login(request, response);
                    break;
                default:
                    travelList(request, response);
                    break;
            }
        } catch (SQLException ex) {
            throw new ServletException(ex);
        }
    }

    private void travelList(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {
        response.setContentType("text/html");
        TravelService travelService = new TravelService();
        var ticketList = travelService.ticketSearch(request.getParameter("date"),
                request.getParameter("origin"), request.getParameter("destination"));
        request.setAttribute("travelList", ticketList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("ticketBuying.jsp");
        dispatcher.forward(request, response);
    }

    private void login(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {
        response.setContentType("text/html");
        UserService userservice = new UserService();
        var user = userservice.Login(request.getParameter("username"), request.getParameter("password"));
        System.out.println(user);
        if (user != null) {
            try {
                request.getRequestDispatcher("ticketBuying.jsp").forward(request, response);
            } catch (ServletException e) {
                e.printStackTrace();
            }
        } else {
        }
    }

    private void signUp(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {
        response.setContentType("text/html");
        UserService userservice = new UserService();
        var user = userservice.Login(request.getParameter("username"), request.getParameter("password"));
        userservice.save(user);
        try {
            request.getRequestDispatcher("index.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        }
    }

    private void buy(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {
        response.setContentType("text/html");
        TravelService travelService = new TravelService();
        UserService userService = new UserService();
        TicketService ticketService = new TicketService();
        var travel = travelService.findById(Integer.valueOf(request.getParameter("travel_id")));
        var user = userService.findById(Integer.valueOf(request.getParameter("your_id")));
        var ticket = new Ticket(user,travel);
        ticketService.save(ticket);
        request.setAttribute("ticket", ticket);
        RequestDispatcher dispatcher = request.getRequestDispatcher("showFinalTicket.jsp");
        dispatcher.forward(request, response);
    }

    public void destroy() {
    }
}