package cn.yang.login.servlet;

import cn.yang.login.domain.Account;
import cn.yang.login.service.AccountService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 上海万达小额贷款有限公司
 * Created by 杨静 on 2017/10/26
 */
public class RegisterServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    private AccountService accountService = new AccountService();

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        String name = request.getParameter("name");
        String password = request.getParameter("password");
        if (name == null || name.trim().isEmpty()) {
            request.setAttribute("msg", "账户名不能为空！");
            request.getRequestDispatcher("/views/register.jsp").forward(request, response);
            return;
        }
        if (password == null || password.trim().isEmpty()) {
            request.setAttribute("msg", "密码不能为空！");
            request.getRequestDispatcher("/views/register.jsp").forward(request, response);
            return;
        }
        Account account = new Account();
        account.setName(name);
        account.setPassword(password);
        accountService.addAccount(account);
        request.setAttribute("msg", "恭喜，注册成功！");
        request.getRequestDispatcher("/index.jsp").forward(request, response);
    }
}
