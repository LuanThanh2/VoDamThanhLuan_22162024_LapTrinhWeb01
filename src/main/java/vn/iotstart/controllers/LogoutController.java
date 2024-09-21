package vn.iotstart.controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet(urlPatterns = {"/logout"})
public class LogoutController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Lấy session hiện tại
        HttpSession session = req.getSession(false);

        // Kiểm tra nếu session tồn tại và xóa session
        if (session != null) {
            session.invalidate(); // Xóa tất cả dữ liệu trong session
        }

        // Chuyển hướng người dùng về trang login
        resp.sendRedirect(req.getContextPath() + "/views/login.jsp");
    }
}
