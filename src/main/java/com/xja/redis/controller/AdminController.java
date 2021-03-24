package com.xja.redis.controller;

import com.xja.redis.entity.Admin;
import com.xja.redis.entity.Product;
import com.xja.redis.service.AdminService;
import com.xja.redis.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@RequestMapping("admin")
public class AdminController {
    @Autowired
    AdminService adminService;

    @Autowired
    ProductService productService;

    @RequestMapping("login")
    public String login(Admin admin, HttpServletResponse response, Model model){
        try{
            Admin loginAdmin = adminService.selectAdminByName(admin.getAdminname());
            if(loginAdmin==null){
                model.addAttribute("msg", "名称错误");
                return "/login.jsp";
            }
            //判断密码是否正确
            if(!loginAdmin.getPassword().equals(admin.getPassword())){
                model.addAttribute("msg", "密码错误");
                return "/login.jsp";
            }
            List<Product> productList = productService.findAll();
            model.addAttribute("loginAdmin",loginAdmin);
            model.addAttribute("productList",productList);
            return "/main.jsp";
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return "redirect:/error.jsp";
    }


}
