package cn.yang.login.servlet;

import cn.yang.login.domain.Account;
import cn.yang.login.service.AccountService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

/**
 * 上海万达小额贷款有限公司
 * Created by 杨静 on 2017/10/26
 */
public class LoginServlet extends HttpServlet {

    private AccountService accountService = new AccountService();

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");

        String name = request.getParameter("name");
        String password = request.getParameter("password");
        String password1 = request.getParameter("password1");

        if (name == null || name.trim().isEmpty()) {
            request.setAttribute("msg", "账户名不能为空！");
            request.getRequestDispatcher("/index.jsp").forward(request, response);
            return;
        }
        if (password == null || password.trim().isEmpty()) {
            request.setAttribute("msg", "密码不能为空！");
            request.getRequestDispatcher("/index.jsp").forward(request, response);
            return;
        }
        if (password1 == null || password1.trim().isEmpty()) {
            request.setAttribute("msg", "请再次确认密码！");
            request.getRequestDispatcher("/index.jsp").forward(request, response);
            return;
        }
        if (!password1.trim().equals(password.trim())) {
            request.setAttribute("msg", "两次输入的密码不一致！");
            request.getRequestDispatcher("/index.jsp").forward(request, response);
            return;
        }

        Account account = accountService.findAccount(name);

        if (account == null) {
            request.setAttribute("msg", "该用户不存在，请先注册！");
            request.getRequestDispatcher("/index.jsp").forward(request, response);
        } else {
            String pwd = account.getPassword();
            if (!password.trim().equals(pwd.trim())) {
                request.setAttribute("msg", "密码错误，请重新输入！");
                request.getRequestDispatcher("/index.jsp").forward(request, response);
            } else {
                request.setAttribute("msg", "恭喜，登录成功！");
                request.getRequestDispatcher("/views/home.jsp").forward(request, response);
            }
        }
    }
}
